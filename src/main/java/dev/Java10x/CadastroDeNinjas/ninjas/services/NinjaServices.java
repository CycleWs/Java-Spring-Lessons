package dev.Java10x.CadastroDeNinjas.ninjas.services;

import dev.Java10x.CadastroDeNinjas.ninjas.models.NinjaModel;
import dev.Java10x.CadastroDeNinjas.ninjas.repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaServices {

    //@Autowired //todo Cria um construtor automaticamente para injeção de dependencia
    private NinjaRepository ninjaRepository;

    public NinjaServices(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //todo Lógica para listar todos os ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }


    //todo Lógica para listar ninja por ID
    public NinjaModel listarNinjaById(Long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }

    //todo Lógica para criar um Ninhja
    public NinjaModel criarNinja(NinjaModel ninjaModel){

        return ninjaRepository.save(ninjaModel);
    }
}
