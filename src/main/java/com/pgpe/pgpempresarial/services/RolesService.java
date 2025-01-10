package com.pgpe.pgpempresarial.services;

import com.pgpe.pgpempresarial.dtos.ProjectsDTO;
import com.pgpe.pgpempresarial.models.Projects;
import com.pgpe.pgpempresarial.models.Roles;

import java.util.List;
import java.util.UUID;

public interface RolesService {

    public Roles saveRole(Roles role);
    public Roles findRole(UUID roleId);
    public List<Roles> getRoles();
    public void deleteRole(UUID projectId);
    public Roles updateRole(ProjectsDTO project);
}
