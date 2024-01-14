package com.jobquest.application.controller;

import com.jobquest.application.entity.Role;
import com.jobquest.application.entity.User;
import com.jobquest.application.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    public RoleService roleService;

    @GetMapping("/role")
    public List<Role> getRoles() {
        return roleService.getRoles();
    }

    @PostMapping("/role/create")
    public void addRoles(@RequestBody Role role) {
        roleService.addRoles(role);
    }
}
