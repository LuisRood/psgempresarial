package com.pgpe.pgpempresarial.services;

import com.pgpe.pgpempresarial.models.Projects;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

public interface ProjectsService {

    public Projects saveProject(Projects project);
    public Projects findProject(UUID projectId);
    public List<Projects> getProjects();
    public void deleteProject(UUID projectId);
    public Projects updateProject(Projects project);
}
