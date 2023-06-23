package com.example.spring002.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
@NoArgsConstructor
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String surname;
    private String email;
    private String city;


    public User(String name, String surname, String email, String city) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.city = city;
    }

}
