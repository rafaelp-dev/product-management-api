package com.rafael.product_management.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductEntity {
    private String name;
    private String description;
    private double price;
    private int quantity;
}
