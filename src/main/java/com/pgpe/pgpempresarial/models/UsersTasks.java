package com.pgpe.pgpempresarial.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@IdClass(UsersTasksId.class) // Aqui se le esta asginando la clase Id, osea la clase que ya definimos con el Id compuesto
@Table(name="usertasks") // Nombre de la tabla
public class UsersTasks {

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users userId;

    @Id
    @ManyToOne
    @JoinColumn(name = "task_id")
    private Tasks taskId;

    @Column(name = "assignment_date", nullable = false)
    private LocalDateTime assignmentDate = LocalDateTime.now();
}
