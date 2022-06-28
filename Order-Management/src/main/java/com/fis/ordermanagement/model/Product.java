package com.fis.ordermanagement.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.Constraint;
import javax.validation.constraints.*;

@Entity
@Table(name="product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",unique = true)
    private Long id;
    @NotNull
    @Column(name="name")
    private String name;
    @NotNull
    @Min(1)
    @Column(name="price")
    private Double price;
    @NotNull
    @Min(0)
    @Column(name="available")
    private Long available;
}
