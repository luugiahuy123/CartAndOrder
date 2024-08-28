package org.example.ontap2.service;

import org.example.ontap2.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {
    List<User> getAllUsers();
    User getUserById(Integer id);
    User saveUser(User user);
    boolean deleteUser(Integer id);
}
