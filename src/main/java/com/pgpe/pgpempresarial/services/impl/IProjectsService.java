package com.pgpe.pgpempresarial.services.impl;

import com.pgpe.pgpempresarial.dtos.ProjectsDTO;
import com.pgpe.pgpempresarial.exceptions.InternalServerErrorException;
import com.pgpe.pgpempresarial.exceptions.ResourceNotFoundException;
import com.pgpe.pgpempresarial.mappers.ProjectsMapper;
import com.pgpe.pgpempresarial.models.Projects;
import com.pgpe.pgpempresarial.repositories.ProjectsRepository;
import com.pgpe.pgpempresarial.services.ProjectsService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class IProjectsService implements ProjectsService {

    @Autowired
    private ProjectsRepository projectsRepository;
    @Autowired
    private ProjectsMapper projectsMapper;

    private static final Logger logger = LoggerFactory.getLogger(IProjectsService.class);

    @Override
    public Projects saveProject(Projects project) {
        try {
            return projectsRepository.save(project);
        }catch(Exception e){
            logger.error("Error al guardar el proyecto: {}", e.getMessage(), e);
            throw new InternalServerErrorException("No se pudo guardar el proyecto");
        }
    }

    @Override
    public Projects findProject(UUID projectId) {
        try {
            return projectsRepository.findById(projectId)
                    .orElseThrow(() -> new ResourceNotFoundException("El proyecto con ID " + projectId + " no fue encontrado"));
        }catch (Exception e){
            logger.error("Error al buscar el proyecto con ID {} : {}", projectId, e.getMessage(),e);
            throw new InternalServerErrorException("Ocurrio un error al buscar el proyecto");
        }
    }

    @Override
    public List<Projects> getProjects() {
        try{
            return projectsRepository.findAll();
        }catch (Exception e){
            logger.error("Error al listar todos los proyectos: {}",e.getMessage(),e);
            throw new InternalServerErrorException("Ocurrio un error al recuperar todos los proyectos");
        }
    }

    @Override
    public void deleteProject(UUID projectId) {
        try{
            Projects project = findProject(projectId);
            projectsRepository.deleteById(projectId);
        }catch (ResourceNotFoundException e){
            throw e;
        }catch (Exception e) {
            logger.error("Error al eliminar el proyecto con ID {}:{}",projectId,e.getMessage(),e);
            throw new InternalServerErrorException("Ocurrió un error al eliminar el proyecto");
        }
    }

    @Override
    public Projects updateProject(ProjectsDTO projectDTO) {
        try {
            Projects project = findProject(projectDTO.getProjectId());
            projectsMapper.updateProjectFromDto(projectDTO,project);
            return saveProject(project);
        }catch (ResourceNotFoundException e){
            throw e;
        }catch (Exception e){
            logger.error("Error al actualizar el proyecto con ID {}:{}",projectDTO.getProjectId(),e.getMessage(),e);
            throw new InternalServerErrorException("Ocurrio un error al actualizar el proyecto");
        }
    }
}
