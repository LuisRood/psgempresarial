package com.pgpe.pgpempresarial.models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@IdClass(UsersRolesId.class) // Aqui se le esta asginando la clase Id, osea la clase que ya definimos con el Id compuesto
@Table(name = "userroles") // Nombre de la tabla
public class UsersRoles {
    @Id
    @ManyToOne
    @JoinColumn(name ="role_id")
    private Roles roleId;

    @Id
    @ManyToOne
    @JoinColumn(name="user_id")
    private Users userId;
}
