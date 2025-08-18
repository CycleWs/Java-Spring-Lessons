package dev.Java10x.CadastroDeNinjas.missoes.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class missoesController {

    //todo adcionar missao (CREATE)
    @PostMapping("/criar")
    public String criarMissao(){

        return "Missao criada";
    }

    //todo procurar missoes por ID (READ)
    @GetMapping("/todosID")
    public String mostrarMissoesPorId(){
        return "Missoes por ID";
    }

    //todo Mostrar todos as missoes (READ)
    @GetMapping("/todos")
    public String mostrarTodasMissoes(){
        return "Todas as missoes";
    }

    //todo Alterar dados das missoes (UPDATE)
    @PutMapping("/alterarID")
    public String alterarMissaoPorId(){
        return "Missao alterada por ID ";
    }

    //todo Deletar missão por ID (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarMissaoPorId(){
        return "Missao Deletada por Id";
    }
}
