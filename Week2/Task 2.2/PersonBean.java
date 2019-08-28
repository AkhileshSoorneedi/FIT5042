/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fit5042.mbeans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author akhil
 */
@Named(value = "personBean")
@SessionScoped
public class PersonBean implements Serializable {

    /**
     * Creates a new instance of PersonBean
     */
    private String name;
    private int age;
    private String message;
    public PersonBean() {
    }

    public PersonBean(String name, int age, String message) {
        this.name = name;
        this.age = age;
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMessage() {
        return message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
