package com.mesutgolcuk.creditapplication.dao;

import com.mesutgolcuk.creditapplication.model.CreditApplicationEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CreditApplicationDao {
    @PersistenceContext
    private EntityManager entityManager;

    public void create(CreditApplicationEntity application) {
        entityManager.persist(application);
    }

}
