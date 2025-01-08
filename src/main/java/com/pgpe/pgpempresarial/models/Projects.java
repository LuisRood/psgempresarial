package com.pgpe.pgpempresarial.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name="Projects")
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID projectId;

    @Column(nullable = false, length = 255)
    private String projectName;

    private String description;

    @Column(nullable = false)
    private Date dateStart;

    private Date dateEnd;

    @Column(nullable = false, length = 50)
    private String state;

    @ManyToOne
    @JoinColumn(name = "creator_id", nullable = false)
    private Users creatorId;

    @OneToMany(mappedBy = "projectId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UsersProjects> usersProjects = new ArrayList<>();

    @OneToMany(mappedBy = "projectId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tasks> tasks = new ArrayList<>();
}
