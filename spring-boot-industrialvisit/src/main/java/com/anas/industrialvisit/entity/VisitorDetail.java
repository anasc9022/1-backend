package com.anas.industrialvisit.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="visitor")
@Data
public class VisitorDetail {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
        private Long id;

        @Column(name="firstName", nullable=false)
        private String firstName;

        @Column(name="phone", nullable=false)
        private String phone;

        @Column(name="email", nullable=false)
        private String email;

        @Column(name="city", nullable=false)
        private String city;

        @Column(name="country", nullable=false)
        private String country;

        @Column(name="state", nullable=false)
        private String state;

}
