package net.zerotodev.api.user.service;

import net.zerotodev.api.user.domain.User;
import net.zerotodev.api.user.domain.UserDto;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface UserService {
    boolean existsByUsername(String username);
    Optional<User> findByUsername(String username);
    UserDto signin(User user);
    String signup(User user);
    List<User> findAll();
    User getById(long id);
    void save(User user);
    long count();
    void deleteById(long id);
}
