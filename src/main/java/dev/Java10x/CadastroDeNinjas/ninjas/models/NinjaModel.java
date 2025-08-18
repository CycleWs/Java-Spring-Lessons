package dev.Java10x.CadastroDeNinjas.ninjas.models;

import dev.Java10x.CadastroDeNinjas.missoes.models.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//todo Entity transforma uma class em uma entidade da DATABASE
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data //todo Cria os Getters & Setters automaticamente para todas as variaveis
public class NinjaModel {


    //todo Cria um ID automaticamente na tabela
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "idade")
    private String idade;

    //todo @ManyToOne = UM NINJA SÓ TEM UMA ÚNICA MISSÃO POR VEZ!
    @ManyToOne
    @JoinColumn(name = "missoes_id") //foreign Key || Chave estrangeira
    private MissoesModel missoes;
}