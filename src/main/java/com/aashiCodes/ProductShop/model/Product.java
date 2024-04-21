package com.aashiCodes.ProductShop.model;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;
import java.math.BigDecimal;
import java.net.SocketOption;

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
