package tech.burkinabe.todo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tech.burkinabe.todo.domain.User;
import tech.burkinabe.todo.repository.UserRepository;

@Service
@AllArgsConstructor
public class UserService {

    private final  UserRepository userRepository;

    public User save(User user) {
        if (userRepository.existsById(user.getId())) {

        }
        return userRepository.save(user);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }
}
