package org.example.ontap2.service;

import org.example.ontap2.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User getUserById(Integer id) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public boolean deleteUser(Integer id) {

        return false;
    }
}
