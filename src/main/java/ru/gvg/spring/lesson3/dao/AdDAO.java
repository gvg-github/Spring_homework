package ru.gvg.spring.lesson3.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.gvg.spring.lesson3.entity.Ad;

import java.util.List;

/**
 * Created by Valeriy on 02.06.2018.
 */
@Component
@Transactional
public class AdDAO extends AbstractDAO {

    public List<Ad> getListAd() {
        return em.createQuery("SELECT e FROM Ad e", Ad.class).getResultList();
    }

    public Ad merge(Ad ad) {
        return em.merge(ad);
    }
}
