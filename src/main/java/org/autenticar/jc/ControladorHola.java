package org.autenticar.jc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ControladorHola {

    @GetMapping("/")
    public String hola(){
        return "Hola mundo";
    }


    @GetMapping("/borrego")
    public String borrego(){
        return "Eres un borrego";
    }
}
