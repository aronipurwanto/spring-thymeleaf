package com.arp.springthymeleaf.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {
    private Long id;
    private Long categoryId;
    private String name;
    private String description;
    private Double price;
    private Double quantity;
}
