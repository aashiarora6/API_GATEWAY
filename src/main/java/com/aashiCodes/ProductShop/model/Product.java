package com.aashiCodes.ProductShop.model;


import java.lang.annotation.Documented;
import java.math.BigDecimal;

@Document(value = "product")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Product {
    @Id
    private String id;
    private String name;
    private  String description;
    private BigDecimal price;
}
