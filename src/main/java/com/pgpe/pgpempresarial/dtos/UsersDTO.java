package com.pgpe.pgpempresarial.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class UsersDTO {

    private UUID userId;
    private String userName;
    private String userLastname;
    private String email;
    private String password; //Don't forget hash the password
    private String phone;
    private LocalDateTime creationDate = LocalDateTime.now();
    private Boolean active;
}
