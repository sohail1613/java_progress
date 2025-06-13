package com.example.crud.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //i should add parents in it, then make it more realistic as well
    private Long id;
    private String name;
    private String surName;
    private Long phoneNumber;
    private String country;
    private String city;
    private String email;
}
