package com.assessment.products.dto;

import java.util.List;

// import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
// @JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductResponse {
	
	 private List<ProductDto> content;
     private int id;
	    private String name;
	    private String status;	   

}
