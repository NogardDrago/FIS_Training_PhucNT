package com.fis.ordermanagement.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",unique = true)
    private Long id;
    @NotNull
    @Column(name="name")
    private String name;
    @NotNull
    @Column(name="mobile",unique = true)
    private String mobile;
    @NotNull
    @Column(name="address",unique = true)
    private String address;
    @Column(name="order_list")
    List<Order> orderList;
}
