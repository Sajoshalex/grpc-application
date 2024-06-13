package com.assessment.products.exceptions;

public class DatabaseOperationFailedException extends RuntimeException {
    private static final long serialVerisionUID = 1;

    public DatabaseOperationFailedException(String message) {
        super(message);
    }
}