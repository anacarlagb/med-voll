package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: Ana Carla Bibiano
 * Data: 08/10/23
 * Based on Curso Alura
 * */
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping
    public String olaMundo(){
       return "Hello World Spring";
    }
}
