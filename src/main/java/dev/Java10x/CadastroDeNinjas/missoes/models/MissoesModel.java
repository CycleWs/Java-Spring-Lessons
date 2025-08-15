package dev.Java10x.CadastroDeNinjas.missoes.models;

import dev.Java10x.CadastroDeNinjas.ninjas.models.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private char dificuldade;

    //todo OneToMany = UMA MISSÃO, PARA VÁRIOS NINJAS!
    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;

}
