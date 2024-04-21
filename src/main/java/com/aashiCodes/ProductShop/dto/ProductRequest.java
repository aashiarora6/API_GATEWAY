package com.aashiCodes.ProductShop.dto;


import jdk.jfr.DataAmount;
import lombok.Data;


import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private String name;
    private String description;
    private BigDecimal price;
}
