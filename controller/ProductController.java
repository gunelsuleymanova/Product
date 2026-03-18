package com.example.product.controller;

import com.example.product.dao.entity.ProductEntity;
import com.example.product.dto.request.ProductRequestDto;
import com.example.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/product")
public class ProductController {
    private final ProductService productService;

    @PostMapping("/create")
    public void createProduct(@RequestHeader("user-id")Long  userId, @RequestBody ProductRequestDto dto){
        productService.createProduct(userId,dto);
    }


    @GetMapping("/get")
    public List<ProductEntity> getProduct(@RequestHeader("user-id") Long id){
        return productService.GetProductById(id);
    }





}
