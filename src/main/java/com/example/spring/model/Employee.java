package com.example.spring.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue( strategy =  GenerationType.IDENTITY)
    private long id;

    @Column( nullable = false )
    private  String firstname;

    @Column(nullable = false)
    private  String lastname;

    @Column(nullable = false)
    private String email;
}
