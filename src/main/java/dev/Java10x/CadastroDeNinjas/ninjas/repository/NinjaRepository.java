package dev.Java10x.CadastroDeNinjas.ninjas.repository;

import dev.Java10x.CadastroDeNinjas.ninjas.models.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}
