package com.jobquest.application.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Role {
    @Id
    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "name", unique = true, nullable = false)
    private String name;
}
