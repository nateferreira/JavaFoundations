package com.example.lojaroupa.controller;

import com.example.lojaroupa.model.DadosRoupa;
import com.example.lojaroupa.model.Roupa;
import com.example.lojaroupa.model.RoupaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controller - Responsavel por receber as requisoções em HTTP
    // Rest - API Rest

    // Funcionamento do REST - Usa metodo HTTP para definir ações
    // Metodo Get - Busca Dados
    // Metodo Post - Criar Dados
    // Metodo Put - Atualizar Dados
    // Metodo Delete - Remover Dados
    @RestController

    // Define o URL do Controller
    // Nosso Controller tera o seguinte endpoint:
    // http://localhost:8080/roupas
    @RequestMapping("/roupas")

    // Liberar o acesso
    @CrossOrigin(origins = "*")

    public class ControllerRoupa {

    @Autowired
    private RoupaRepository roupaRepository;

    //Registrar uma roupa do banco
    @PostMapping
    public void cadastrarRoupa(@RequestBody DadosRoupa dadosRoupa){
        roupaRepository.save(new Roupa(dadosRoupa));
    }

    @GetMapping
        public List<Roupa> listarRoupas(){
        return roupaRepository.findAll();
        }

}
