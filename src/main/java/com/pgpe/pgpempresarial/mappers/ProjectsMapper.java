package com.pgpe.pgpempresarial.mappers;

import com.pgpe.pgpempresarial.dtos.ProjectsDTO;
import com.pgpe.pgpempresarial.models.Projects;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface ProjectsMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateProjectFromDto(ProjectsDTO dto, @MappingTarget Projects entity);
}
