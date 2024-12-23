package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "app-class")
public final class ApplicationPropertiesClass {

    /**
     * must be filled in.
     */
    private final String foo;


    public ApplicationPropertiesClass(String foo) {
        this.foo = foo;
    }

    public String foo() {
        return foo;
    }
}