package com.workintech.Burger.Rest.Api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "burger", schema = "spring")
public class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotNull
    @NotBlank
    @Column(name = "name")
    private String name;

    @Column(name = "price")
    @DecimalMin("20")
    private double price;

    @Column(name = "isVegan")
    private boolean isVegan;

    @Enumerated(EnumType.STRING)
    private BreadType breadType;

    @Column(name = "contents")
    private String contents;
}
