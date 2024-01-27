package com.devsuperior.dscommerce.services.exceptions;

public class ResourcesNotFoundException extends RuntimeException{
    public ResourcesNotFoundException(String msg) {
        super(msg);
    }
}
