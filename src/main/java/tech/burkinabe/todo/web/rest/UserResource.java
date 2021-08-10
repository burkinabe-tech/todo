package tech.burkinabe.todo.web.rest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tech.burkinabe.todo.domain.User;
import tech.burkinabe.todo.service.UserService;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class UserResource {


    private final UserService userService;

    @PostMapping("/users")
    public User createUser(@RequestBody  User user) {
        return  userService.save(user);
    }
}
