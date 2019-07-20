package com.hendisantika.springboot2ehcache3example.model;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot2-ehcache3-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-21
 * Time: 06:26
 */
public class Employee implements Serializable {
    private static final long serialVersionUID = 5517244812959569947L;

    private Long id;
    private String firstName;
    private String lastName;

    public Employee() {
        super();
    }

    public Employee(Long id, String firstName, String lastName) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Getters and setters

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}