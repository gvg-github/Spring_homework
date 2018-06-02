package ru.gvg.spring.lesson3.entity;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

/**
 * Created by Valeriy on 02.06.2018.
 */
@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    private String id = UUID.randomUUID().toString();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
