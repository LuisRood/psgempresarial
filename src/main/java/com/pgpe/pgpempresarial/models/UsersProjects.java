package com.pgpe.pgpempresarial.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Representa la entidad que modela la relación entre los usuarios y los proyectos
 * en la base de datos. Un usuario puede estar asignado a varios proyectos,
 * y cada proyecto puede tener múltiples usuarios asignados.
 */
@Entity
@Data
@IdClass(UsersProjectsId.class) // Aqui se le esta asginando la clase Id, osea la clase que ya definimos con el Id compuesto
@Table(name="userprojects") // Nombre de la tabla
public class UsersProjects {

    /**
     * Representa la relación con la entidad "Users".
     * Este campo forma parte de la clave primaria compuesta.
     * La columna "user_id" en la tabla está referenciada como clave foránea.
     */
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private Users userId;

    /**
     * Representa la relación con la entidad "Projects".
     * Este campo también forma parte de la clave primaria compuesta.
     * La columna "project_id" en la tabla está referenciada como clave foránea.
     */
    @Id
    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Projects projectId;

    /**
     * Fecha y hora de asignación del usuario al proyecto.
     * La columna "assignment_date" almacena este valor y no puede ser nula.
     * Por defecto, se establece como la fecha y hora actual.
     */
    @Column(name = "assignment_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime assignmentDate = LocalDateTime.now();
}
