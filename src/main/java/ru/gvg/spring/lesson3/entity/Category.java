package ru.gvg.spring.lesson3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Valeriy on 02.06.2018.
 */
@Entity
public class Category extends AbstractEntity {

    @Column
    private String name;


    public Category() {

    }

    public Category(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
