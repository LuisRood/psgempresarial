package com.pgpe.pgpempresarial.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID userId;

    @Column(nullable = false,length = 255)
    private String userName;

    @Column(nullable = false,length = 255)
    private String userLastname;

    @Column(nullable = false, unique = true,length = 255)
    private String email;

    @Column(nullable = false,length = 255)
    private String password; //Don't forget hash the password

    @Column(length = 20)
    private String phone;

    @Column(nullable = false)
    private LocalDateTime creationDate = LocalDateTime.now();

    @Column(nullable = false)
    private Boolean active;

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UsersRoles> usersRoles = new ArrayList<>();

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UsersProjects> usersProjects = new ArrayList<>();

    @OneToMany(mappedBy = "creatorId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Projects> projects = new ArrayList<>();

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UsersTasks> usersTasks = new ArrayList<>();

    @OneToMany(mappedBy = "creatorId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tasks> tasks = new ArrayList<>();
}
