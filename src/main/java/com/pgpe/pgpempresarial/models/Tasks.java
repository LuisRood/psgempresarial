package com.pgpe.pgpempresarial.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name="Tasks")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID taskId;

    @Column(nullable = false, length = 255)
    private String title;

    private String description;

    @Column(nullable = false, length = 50)
    private String priority;

    private Date expirationDate;

    @Column(nullable = false, length = 50)
    private String state;

    @ManyToOne
    @JoinColumn(name = "creator_id", nullable = false)
    private Users creatorId;

    @ManyToOne
    @JoinColumn(name = "project_id", nullable = false)
    private Projects projectId;

    @OneToMany(mappedBy = "taskId", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    private List<UsersTasks> usersTasks = new ArrayList<>();
}
