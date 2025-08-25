package com.Jaba.dao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;
import com.Jaba.models.Usuario;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Transactional
public class UsuariosDaoImp implements UsuarioDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
        return  entityManager.createQuery(query).getResultList();

    }
}
