package org.example.ontap2.service;

import org.example.ontap2.model.Role;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IRoleService {
    List<Role> getAllRoles();
    Role getRoleById(Long id);
    Role saveRole(Role role);
    boolean deleteRole(Long id);
}
