package com.expert10.dkl.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    // Personal Information


    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(length = 20)
    private String phoneNumber;

    @Column(length = 100)
    private String address;

    private String city;

    private String country;

    private String postalCode;

    private LocalDate birthDate;


    // Job Information


    @Column(nullable = false)
    private String position;

    private String department;

    private String manager;

    private LocalDate hireDate;

    private BigDecimal salary;

    private Double bonus;

    private String contractType;

    private Boolean active;


    // Authentication


    @Column(unique = true)
    private String username;

    private String password;

    private String role;


    // Time


    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}