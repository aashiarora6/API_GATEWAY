package com.aashiCodes.ProductShop.controller;


import com.aashiCodes.ProductShop.dto.ProductRequest;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){

    }
}
