package com.dynastymasra.domain;

import com.dynastymasra.domain.enumeration.Interest;
import com.dynastymasra.domain.enumeration.Sex;

import javax.persistence.*;

/**
 * Name : Dimas Ragil T
 * FB   : Dimas Ragil T
 * Twit : @dynastymasra
 * Email: dynastymasra@gmail.com
 * Date : 6/11/13
 * Time : 11:00 AM
 */

@Entity
@Table(name = "form")
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "name", nullable = false, unique = true)
    private String nim;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "interest", nullable = false)
    private Interest interest;

    @Column(name = "sex", nullable = false)
    private Sex sex;

    @Column(name = "number", nullable = false)
    private String number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Interest getInterest() {
        return interest;
    }

    public void setInterest(Interest interest) {
        this.interest = interest;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
