package com.pgpe.pgpempresarial.mappers;

import com.pgpe.pgpempresarial.dtos.UsersDTO;
import com.pgpe.pgpempresarial.models.Users;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring")
public interface UsersMapper {

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateUserFromDto(UsersDTO dto, @MappingTarget Users entity);

    UsersDTO toDTO(Users entity);

    Users toEntity(UsersDTO dto);
}
