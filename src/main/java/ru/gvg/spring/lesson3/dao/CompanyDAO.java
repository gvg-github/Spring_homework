package ru.gvg.spring.lesson3.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.gvg.spring.lesson3.entity.Company;

import java.util.List;

/**
 * Created by Valeriy on 02.06.2018.
 */
@Component
@Transactional
public class CompanyDAO extends AbstractDAO {

    public List<Company> getListCompany() {
        return em.createQuery("SELECT e FROM Company e", Company.class).getResultList();
    }

    public Company merge(Company company) {
        return em.merge(company);
    }
}
