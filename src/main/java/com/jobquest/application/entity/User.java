package com.jobquest.application.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
    @Id
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "username",unique = true,nullable = false)
    private String username;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "contact", nullable = false)
    private long contact;
    @OneToOne
    @JoinColumn(name = "role_id")
    private Role role;
}
