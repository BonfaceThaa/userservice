package service;

import domain.Role;
import domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String name, String roleName);
    User getUser(String username);
    List<User>getUsers();
}
