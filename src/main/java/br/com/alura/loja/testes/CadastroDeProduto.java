package br.com.alura.loja.testes;

import br.com.alura.loja.entity.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProduto {
    public static void main(String[] args) {
        Produto celular = new Produto();

        celular.setNome("Xiaomi Redmi");
        celular.setDescricao("Muito legal");
        celular.setPreço(new BigDecimal(800));

        //O atributo passado para persistir é o name do persistence-unit do .xml
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");

        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        em.persist(celular);
        em.getTransaction().commit();
        em.close();
    }
}
