package ru.gvg.spring.lesson3.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by Valeriy on 02.06.2018.
 */
public abstract class AbstractDAO {
    @PersistenceContext(name="persistenceUnit")
    public EntityManager em;
}
