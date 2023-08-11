package med.voll.api.controller;

import org.springframework.web.bind.annotation.*;

/**
 * author: Ana Carla Bibiano
 * Data: 08/10/23
 * Based on Curso Alura
 * */
@RestController
@RequestMapping("professional")
public class ProfessionalController {

    @GetMapping
    public String getProfessional(){
       return "Hello World Spring";
    }


    @PostMapping
    public String createProfessional(@RequestBody  String professional){
      return professional;
    }
}
