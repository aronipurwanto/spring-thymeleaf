package com.arp.springthymeleaf.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {
    private Long id;
    private Long categoryId;
    private String name;
    private String description;
    private Double price;
    private Double quantity;
}
