package com.pgpe.pgpempresarial.dtos;

import jakarta.persistence.Column;
import lombok.Data;

import java.util.UUID;

@Data
public class RolesDTO {

    private UUID roleId;
    private String roleName;
    private String description;
}
