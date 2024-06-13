package com.assessment.products.service;

import java.util.List;

import com.assessment.products.dto.ProductDto;

public interface ProductService {
	
	ProductDto createProduct(ProductDto productDto);
	List<ProductDto> getAllProduct();
    ProductDto getProductById(int id);
    ProductDto updateProduct(ProductDto productDto);
    ProductDto deleteProductId(int id);

}
