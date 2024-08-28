package org.example.ontap2.service;

import org.example.ontap2.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {
    @Override
    public List<Role> getAllRoles() {
        return List.of();
    }

    @Override
    public Role getRoleById(Long id) {
        return null;
    }

    @Override
    public Role saveRole(Role role) {
        return null;
    }

    @Override
    public boolean deleteRole(Long id) {

        return false;
    }
}
