package com.assessment.products.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.assessment.product.CreateProductRequest;
import com.assessment.product.CreateProductResponse;
import com.assessment.product.DeleteRequest;
import com.assessment.product.DeleteResponse;
import com.assessment.product.GetAllProductRequest;
import com.assessment.product.GetAllProductResponse;
import com.assessment.product.GetProductRequest;
import com.assessment.product.GetProductResponse;
import com.assessment.product.ProductServiceGrpc.ProductServiceImplBase;
import com.assessment.product.UpdateRequest;
import com.assessment.product.UpdateResponse;
import com.assessment.products.dto.ProductDto;
import com.assessment.products.service.ProductService;

import io.grpc.stub.StreamObserver;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@Data
@NoArgsConstructor
public class ProductServiceGrpcImpl extends ProductServiceImplBase{
	
	private ProductService productService;	
	
	
	
	@Autowired
	public ProductServiceGrpcImpl (ProductService productService) {
		 this.productService = productService;		
		 
	}
	
	@Override
	public void getAllProducts(GetAllProductRequest request, StreamObserver<GetAllProductResponse> responseObserver) {		
		
		ArrayList<ProductDto> list = (ArrayList<ProductDto>) productService.getAllProduct();
		
		GetAllProductResponse.Builder productBuilder = GetAllProductResponse.newBuilder();
		list.forEach(product -> {
			productBuilder.addProductDetails(GetProductResponse.newBuilder().setProductId(product.getId()).setName(product.getName()).setStatus(product.getStatus()).build());
		});
		
		GetAllProductResponse response = productBuilder.build();
		
		 responseObserver.onNext(response);
		 responseObserver.onCompleted();
				
	}
	@Override
	public void createProduct(CreateProductRequest request, StreamObserver<CreateProductResponse> responseObserver) {
		
		ProductDto productDto = new ProductDto();
		productDto.setName(request.getName());
		productDto.setStatus(request.getStatus());
		
		ProductDto createdProduct = productService.createProduct(productDto);
		
		CreateProductResponse productResp = CreateProductResponse.newBuilder().setProductId(createdProduct.getId()).setMessage("Product Created").build();
		
		responseObserver.onNext(productResp);
		
		responseObserver.onCompleted();
				
	}
	@Override
	public void getProduct(GetProductRequest request, StreamObserver<GetProductResponse> responseObserver) {
	
	// System.out.println("Request parameters " + request.getProductId());
	
	ProductDto productDto = productService.getProductById(request.getProductId());
	
	GetProductResponse getProductResp = GetProductResponse.newBuilder().setProductId(productDto.getId()).setName(productDto.getName()).setStatus(productDto.getStatus()).build();
	
	responseObserver.onNext(getProductResp);
	
	responseObserver.onCompleted();
			
	}
	@Override
	public void updateProduct(UpdateRequest request, StreamObserver<UpdateResponse> responseObserver) {
		
		ProductDto productDto = new ProductDto();
		
		productDto.setId(request.getProductId());
		productDto.setName(request.getName());
		productDto.setStatus(request.getStatus());
		
		ProductDto updatedProduct = productService.updateProduct(productDto);
		
		UpdateResponse updateResp = UpdateResponse.newBuilder().setMessage(updatedProduct.getMessage()).setProductId(updatedProduct.getId()).setName(updatedProduct.getName()).setStatus(updatedProduct.getStatus()).build();
		
		responseObserver.onNext(updateResp);
		
		responseObserver.onCompleted();
		
	}
	
	@Override
	public void deleteProduct(DeleteRequest request, StreamObserver<DeleteResponse> responseObserver) {
	
	// System.out.println("Request parameters " + request.getProductId());
	
	ProductDto productDto = productService.deleteProductId(request.getProductId());
	
	DeleteResponse deleteResp = DeleteResponse.newBuilder().setMessage(productDto.getMessage()).build();
	
	responseObserver.onNext(deleteResp);
	
	responseObserver.onCompleted();
			
	}
	
	
	

}
