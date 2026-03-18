package com.example.product.mapper;

import com.example.product.dao.entity.ProductEntity;
import com.example.product.dto.request.ProductRequestDto;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public ProductEntity dtoToEntity(ProductRequestDto dto){
        return ProductEntity.builder()
                .productName(dto.getProductName())
                .category(dto.getCategory())
                .userId(dto.getUserId())
                .build();
    }

}
