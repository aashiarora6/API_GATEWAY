package com.aashiCodes.ProductShop.service;


import com.aashiCodes.ProductShop.dto.ProductRequest;
import com.aashiCodes.ProductShop.model.Product;
import com.aashiCodes.ProductShop.repository.ProductRepository;

@Service
@RequiredArgsConstructor
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
    }
}
