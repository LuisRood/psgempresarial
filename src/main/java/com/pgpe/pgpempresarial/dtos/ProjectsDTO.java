package com.pgpe.pgpempresarial.dtos;

import lombok.Data;

import java.sql.Date;
import java.util.UUID;

@Data
public class ProjectsDTO {
    private UUID projectId; // Para identificar el proyecto a actualizar
    private String projectName;
    private String description;
    private Date dateStart;
    private Date dateEnd;
    private String state;
    private UUID creatorId;
}
