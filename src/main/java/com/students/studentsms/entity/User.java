package com.students.studentsms.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @Column(name = "id")
    @JsonProperty("id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "username")
    @JsonProperty("username")
    private String username;

    @Column(name = "password")
    @JsonProperty("password")
    private String password;

    @Column(name = "role")
    @JsonProperty("role")
    private String role;

}
