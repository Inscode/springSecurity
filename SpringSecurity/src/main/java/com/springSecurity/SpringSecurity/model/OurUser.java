package com.springSecurity.SpringSecurity.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name="ourusers")

public class OurUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String email;
    private String password;
    private String roles;
}
