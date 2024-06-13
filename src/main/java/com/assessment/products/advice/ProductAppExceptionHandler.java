package com.assessment.products.advice;

import org.springframework.dao.EmptyResultDataAccessException;

import com.assessment.products.exceptions.ProductNotFoundException;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.advice.GrpcAdvice;
import net.devh.boot.grpc.server.advice.GrpcExceptionHandler;

@GrpcAdvice
@Slf4j
public class ProductAppExceptionHandler {
	
	 @GrpcExceptionHandler(Exception.class)
     public StatusRuntimeException handleError(Exception ex) {
	 log.info("Generic Error", ex);
     return  Status.INVALID_ARGUMENT.withDescription(ex.getMessage())
           .asRuntimeException();
     }
	 
	 @GrpcExceptionHandler(EmptyResultDataAccessException.class)
	    public StatusRuntimeException  handleEmptyResultDataAccessException (EmptyResultDataAccessException ex) {
			log.info("Empty resultset ", ex);
	        return  Status.NOT_FOUND.withDescription("Please check the request parameters! "+ex.getMessage())
	                .asRuntimeException();
	    }
	 @GrpcExceptionHandler(ProductNotFoundException.class)
	    public StatusRuntimeException  handleProductNotFoundException (ProductNotFoundException ex) {
			log.info("Empty resultset ", ex);
	        return  Status.NOT_FOUND.withDescription("Please check the request parameters! "+ex.getMessage())
	                .asRuntimeException();
	    }
   }


