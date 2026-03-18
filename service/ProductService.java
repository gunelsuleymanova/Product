package com.example.product.service;

import com.example.product.dao.entity.ProductEntity;
import com.example.product.dao.repos.ProductRepository;
import com.example.product.dto.request.ProductRequestDto;
import com.example.product.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public void createProduct(Long  userId, ProductRequestDto dto){
        dto.setUserId(userId);
        var product = productMapper.dtoToEntity(dto);
        productRepository.save(product);
    }
    public List<ProductEntity> GetProductById(Long id){
        return productRepository.findByUserId(id);
    }





}
