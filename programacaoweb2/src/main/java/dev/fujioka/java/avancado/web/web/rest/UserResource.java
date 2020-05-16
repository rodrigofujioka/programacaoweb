package dev.fujioka.java.avancado.web.web.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.fujioka.java.avancado.web.domain.Product;
import dev.fujioka.java.avancado.web.domain.User;
import dev.fujioka.java.avancado.web.service.UserService;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userService;
    
    @PostMapping("/user/{firstName}")
    public List<User> getUserByName(@PathVariable String firstName){
    	return userService.findByName( firstName);
    }
    
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
    public ResponseEntity update(@Valid @RequestBody User user) {
        userService.save(user);
        return ResponseEntity.ok().body(user);
    }


    @DeleteMapping("/user")
    public ResponseEntity<String> delete(@Valid @RequestBody User user) {
        userService.delete(user);
       return  ResponseEntity.ok().body("User excluded ID: " + user.getId());
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id) {
        userService.deleteById(id);
        return ResponseEntity.ok().body("User excluded ID: " + id);
    }

    /*3 passo*/
    @GetMapping("/user/{id}")
	public List<User> getListById() {
		return userService.findAll();
	}
	@GetMapping("/user/{login}")
	public List<User> getListByLogin() {
		return userService.findAll();
	}
	@GetMapping("/user/{password}")
	public List<User> getListByPassword() {
		return userService.findAll();
	}
	@GetMapping("/user/{firstName}")
	public List<User> getListByFirstName() {
		return userService.findAll();
	}
	@GetMapping("/user/{lastName}")
	public List<User> getListById() {
		return userService.findAll();
	}
}
