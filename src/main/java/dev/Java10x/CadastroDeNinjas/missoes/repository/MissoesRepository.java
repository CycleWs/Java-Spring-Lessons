package dev.Java10x.CadastroDeNinjas.missoes.repository;

import dev.Java10x.CadastroDeNinjas.missoes.models.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
}
