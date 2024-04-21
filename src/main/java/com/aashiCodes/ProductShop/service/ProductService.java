package com.aashiCodes.ProductShop.service;


import com.aashiCodes.ProductShop.dto.ProductRequest;
import com.aashiCodes.ProductShop.model.Product;
import com.aashiCodes.ProductShop.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import lombok.Builder;

import static jdk.jpackage.internal.Log.info;

@Builder
@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
        info("Product is saved!");
    }
}
