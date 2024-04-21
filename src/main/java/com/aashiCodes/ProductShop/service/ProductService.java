package com.aashiCodes.ProductShop.service;


import com.aashiCodes.ProductShop.dto.ProductRequest;
import com.aashiCodes.ProductShop.dto.ProductResponse;
import com.aashiCodes.ProductShop.model.Product;
import com.aashiCodes.ProductShop.repository.ProductRepository;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.mongodb.core.aggregation.MergeOperation.UniqueMergeId.id;


@Builder
@Service
@Slf4j
public class ProductService {

    private final ProductRepository productRepository;
    private final Product product;

    public ProductService(ProductRepository productRepository, Product product) {
        this.productRepository = productRepository;
        this.product = product;
    }

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product){
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}
