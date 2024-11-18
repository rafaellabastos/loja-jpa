package br.com.alura.loja.dao;

import br.com.alura.loja.entity.Produto;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.EntityManager;

@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDao {

    private EntityManager em;

    public void Cadastrar(Produto produto) {
        this.em.persist(produto);
    }

}
