package com.luisrendon.product_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {

    @GetMapping("/api/hello")
    public String saludo(){
        return "Hola es mi primer endpoint de springBott";
    }
}
