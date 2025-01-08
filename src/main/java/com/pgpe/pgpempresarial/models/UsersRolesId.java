package com.pgpe.pgpempresarial.models;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Data
//Clase creada para manejar los Id compuestos de la tabla UsersRoles
public class UsersRolesId implements Serializable {
    private UUID userId;
    private UUID roleId;

    @Override
    public boolean equals(Object o){
        if(this == o) return true; // Se comprueba que sean exactamente el mismo objeto
        if(o == null || getClass() != o.getClass()) return false; // Clase diferente o nula
        UsersRolesId that = (UsersRolesId) o;
        return userId.equals(that.userId) && roleId.equals(that.roleId); // Comparar los campos de las clases
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, roleId); // Generar un hash unico basado en los campos
    }
}
