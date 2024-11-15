package br.com.alura.loja.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "produtos")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUTOS")
    private Long id;

    @Column(name = "NOME_PRODUTOS")
    private String nome;

    @Column(name = "DESCRICAO_PRODUTOS")
    private String descricao;

    @Column(name = "PRECO_PRODUTOS")
    private BigDecimal preço;

}
