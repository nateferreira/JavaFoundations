package com.example.lojaroupa.controller;

import org.springframework.web.bind.annotation.*;

// Controller - Responsavel por receber as requisoções em HTTP
// Rest - API Rest

// Funcionamento do REST - Usa metodo HTTP para definir ações
// Metodo Get - Busca Dados
// Metodo Post - Criar Dados
// Metodo Put - Atualizar Dados
// Metodo Delete - Remover Dados
@RestController

// Defini o URL do Controller
// Nosso Controller tera o seguinte endpoint:
// http://localhost:8080/roupas
@RequestMapping("/roupas")

// Liberar o acesso
@CrossOrigin(origins = "*")

public class ControllerRoupa {

    //Registrar uma roupa do banco
    @PostMapping
    public void cadastrarRoupa(@RequestBody String roupa){
        System.out.println(roupa);
    }
}
