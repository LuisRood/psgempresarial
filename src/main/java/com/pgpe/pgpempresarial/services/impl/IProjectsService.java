package com.pgpe.pgpempresarial.services.impl;

import com.pgpe.pgpempresarial.exceptions.ResourceNotFoundException;
import com.pgpe.pgpempresarial.models.Projects;
import com.pgpe.pgpempresarial.repositories.ProjectsRepository;
import com.pgpe.pgpempresarial.services.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class IProjectsService implements ProjectsService {

    @Autowired
    private ProjectsRepository projectsRepository;

    @Override
    public Projects saveProject(Projects project) {
        try {
            return projectsRepository.save(project);
        }catch(Exception e){
            throw new RuntimeException("Error al guardar el usuario" + e.getMessage());
        }
    }

    @Override
    public Projects findProject(UUID projectId) {
        return projectsRepository.findById(projectId)
                .orElseThrow(() -> new ResourceNotFoundException("No se encontro el projecto"));
    }

    @Override
    public List<Projects> getProjects() {
        return List.of();
    }

    @Override
    public void deleteProject(UUID projectId) {

    }

    @Override
    public Projects updateProject(Projects project) {
        return null;
    }
}
