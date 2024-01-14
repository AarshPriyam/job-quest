package com.jobquest.application.service;

import com.jobquest.application.entity.Role;
import com.jobquest.application.entity.User;
import com.jobquest.application.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    public RoleRepository roleRepository;

    public List<Role> getRoles() {
        return roleRepository.findAll();
    }

    public void addRoles(Role role) {
        roleRepository.save(role);
    }


}
