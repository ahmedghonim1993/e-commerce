package com.ahmedGhonim.springjwt.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Ghonim
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Class clazz, String parameter) {
        super(ResourceNotFoundException.generateMessage(clazz.getSimpleName(), parameter));
    }

    private static String generateMessage(String entity, String parameter) {
        return entity.toUpperCase() + " was not found for parameter " + parameter;
    }
}
