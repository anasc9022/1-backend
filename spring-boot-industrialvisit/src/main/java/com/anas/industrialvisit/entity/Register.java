package com.anas.industrialvisit.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="register")
@Data
public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="college_name")
    private String collegeName;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

}
