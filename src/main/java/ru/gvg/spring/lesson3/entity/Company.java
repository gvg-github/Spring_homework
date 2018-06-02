package ru.gvg.spring.lesson3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by Valeriy on 02.06.2018.
 */
@Entity
public class Company extends AbstractEntity {

    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String address;

    public Company() {

    }

    public Company(String name, String description, String address) {
        this.name = name;
        this.description = description;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
