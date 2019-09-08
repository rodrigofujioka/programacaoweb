package dev.fujioka.java.avancado.web.web.rest;

import dev.fujioka.java.avancado.web.model.User;
import dev.fujioka.java.avancado.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getUsers() {
        return userService.findAll();
    }

    @PostMapping("/user")
    public ResponseEntity<User>
    save(@Valid @RequestBody User user) {
        userService.save(user);
        return ResponseEntity.ok(user);

    }


    @PutMapping("/user")
    public String update(@Valid @RequestBody User user) {
        return "Hello World Post";
    }


    @DeleteMapping("/user")
    public String delete(@Valid @RequestBody User user) {
        return "Hello World Post";
    }

    @DeleteMapping("/user/{id}")
    public String deleteById(@PathVariable Long id) {
        return "Hello World Post";
    }


}
