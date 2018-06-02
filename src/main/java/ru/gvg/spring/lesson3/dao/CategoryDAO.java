package ru.gvg.spring.lesson3.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.gvg.spring.lesson3.entity.Category;

import java.util.List;

/**
 * Created by Valeriy on 02.06.2018.
 */
@Component
@Transactional
public class CategoryDAO extends AbstractDAO {

    public List<Category> getListCategory() {
        return em.createQuery("SELECT cat FROM Category cat", Category.class).getResultList();
    }

    public Category merge(Category category) {
        return em.merge(category);
    }
}
