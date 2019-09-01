package dev.fujioka.java.avancado.web.web.rest;

import dev.fujioka.java.avancado.web.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserResource {

    List<User> userList = new LinkedList<>();

    @GetMapping("/user")
    public List<User> getUsers() {

        userList.add(new User(1l, "fujioka", "Rodrigo", "Fujioka"));
        userList.add(new User(2l, "Yumi", "Yumi", "Fujioka"));
        userList.add(new User(3l, "aprovedstudent", "Student", "Study"));
        userList.add(new User(4l, "disapprovedstudent ", "Student", "do not study"));

        return userList;
    }


    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id) {
        return userList.stream().filter(user -> user.getId() == id).findFirst().get();

    }


    @PostMapping("/user")
    public ResponseEntity<User> save(@Valid @RequestBody User user) {
        user.setId(userList.size() + 1l);
        userList.add(user);
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
