package com.rafael.product_management.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity

@Getter
@Setter
@AllArgsConstructor
public class ProductEntity {
    private String name;
    private String description;
    private double price;
    private int quantity;
}
