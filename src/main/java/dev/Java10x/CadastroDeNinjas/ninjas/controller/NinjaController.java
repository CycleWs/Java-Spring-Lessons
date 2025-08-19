package dev.Java10x.CadastroDeNinjas.ninjas.controller;

import dev.Java10x.CadastroDeNinjas.ninjas.models.NinjaModel;
import dev.Java10x.CadastroDeNinjas.ninjas.services.NinjaServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//todo CONTROLLER SÃO AS CLASSES ONDE VOCê IRÁ CONFIGURAR AS ROTAS
@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaServices ninjaServices;

    public NinjaController(NinjaServices ninjaServices) {
        this.ninjaServices = ninjaServices;
    }

    //todo ENDPOINTS

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota!";
    }

    //todo adcionar ninja (CREATE)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninjaModel){

        return ninjaServices.criarNinja(ninjaModel);
    }

    //todo procurar ninja por ID (READ)
    @GetMapping("/listar/{id}")//PathVariable (onde o usuario incluirá o ID na URL para procurar por ID)
    public NinjaModel listarNinjasPorId(@PathVariable Long id){
        return ninjaServices.listarNinjaById(id);
    }

    //todo Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaServices.listarNinjas();
    }

    //todo Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Ninja alterado por ID ";
    }

    //todo Deletar ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja Deletado por Id";
    }

    //todo  > CRUD <
}
