package dev.fujioka.java.avancado.web;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloWorldResource<I> {


    @GetMapping("/hello")
    public String primeiroEndPointGetHello() {
        return "Hello World Get";
    }

    @DeleteMapping("/hello")
    public String primeiroEndPointDeleteHello() {
        return "Hello World Post";
    }


    @PutMapping("/hello")
    public String primeiroEndPointPutHello() {
        return "Hello World Post";
    }

    @PostMapping("/hello")
    public String primeiroEndPointPostHello() {
        return "Hello World Post";
    }

}
