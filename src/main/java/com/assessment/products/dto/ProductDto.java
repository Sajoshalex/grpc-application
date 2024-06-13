package com.assessment.products.dto;

// import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto {
	@NotNull(message = "ProductId is mandatory for updating products")
	private int id;
    private String name;
    private String status;  
    private String message;
}