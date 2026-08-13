package br.com.criandoapi.projeto.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

    @GetMapping("/usuarios")
    public String texto () {
        return "Acessando a API";
    }
}
