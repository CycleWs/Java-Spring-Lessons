package dev.Java10x.CadastroDeNinjas.ninjas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//todo CONTROLLER SÃO AS CLASSES ONDE VOCê IRÁ CONFIGURAR AS ROTAS
@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota!";
    }
}
