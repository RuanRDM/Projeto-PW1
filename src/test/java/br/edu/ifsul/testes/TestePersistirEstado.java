package br.edu.ifsul.testes;

import br.edu.ifsul.modelo.Estado;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestePersistirEstado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PW2022-1-ModelPU");
        EntityManager em = emf.createEntityManager();
        
        Estado e = new Estado();
        e.setId(1);
        e.setNome("Rio Grande do Sul");
        e.setUf("RS");
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}