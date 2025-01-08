package com.pgpe.pgpempresarial.models;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Data
//Clase creada para manejar los Id compuestos de la tabla UsersProjects
public class UsersProjectsId implements Serializable {
    private UUID userId;
    private UUID projectId;

    @Override
    public boolean equals(Object o){
        if(this == o) return true; // Se comprueba que sean exactamente el mismo objeto
        if(o == null || getClass() != o.getClass()) return false; // Clase diferente o nula
        UsersProjectsId that = (UsersProjectsId) o;
        return userId.equals(that.userId) && projectId.equals(that.projectId); // Comparar los campos de las clases
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, projectId); // Generar un hash unico basado en los campos
    }
}
