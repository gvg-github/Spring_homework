package ru.gvg.spring.lesson3.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Created by Valeriy on 02.06.2018.
 */
@Entity
public class Ad extends AbstractEntity {

    @Column
    private String name;
    @Column
    private String content;
    @Column
    private String phoneNumber;

    /*Объявления могут быть разных категорий, от разных компаний, при этом категории и компании
    друг от друга не зависят, поэтому категория и компания указываются только в объявлении
    */
    @ManyToOne
    private Category category;

    @ManyToOne
    private Company company;

    public Ad() {

    }

    public Ad(String name, String content, String phoneNumber, Category category, Company company) {
        this.name = name;
        this.content = content;
        this.phoneNumber = phoneNumber;
        this.category = category;
        this.company = company;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
