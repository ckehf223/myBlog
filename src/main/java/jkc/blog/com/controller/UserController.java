package jkc.blog.com.controller;

import jkc.blog.com.domain.User;
import jkc.blog.com.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @PostMapping
    public User save(@RequestBody User user){
        return userRepository.save(user);
    }
}
