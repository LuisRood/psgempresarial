package com.pgpe.pgpempresarial.mappers;

import com.pgpe.pgpempresarial.dtos.RolesDTO;
import com.pgpe.pgpempresarial.models.Roles;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface RolesMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateRoleFromDto(RolesDTO dto, @MappingTarget Roles entity);

    RolesDTO toDto(Roles entity);

    Roles toEntity(RolesDTO dto);
}
