package com.assessment.products.model;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder

public class Product {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    private String name;
	    private String status;	    

}