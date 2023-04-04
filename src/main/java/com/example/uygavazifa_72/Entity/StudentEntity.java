package com.example.uygavazifa_72.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname", nullable = false)
    private String surname;
    @Column(name = "Darja")
    private Integer level;
    @Column(name = "age")
    private Integer age;
    @Column(name = "jinsi")
    private String gender;
    @Column(name = "createdDate")
    private LocalDateTime createdDate;

}
