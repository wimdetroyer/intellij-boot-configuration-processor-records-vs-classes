package com.example.demo;

import jakarta.validation.constraints.NotBlank;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

@ConfigurationProperties(prefix = "app-class")
public final class ApplicationPropertiesClass {

    /**
     * must be filled in.
     */
    private final String foo;


    public ApplicationPropertiesClass(
            @NotBlank String foo) {
        this.foo = foo;
    }

    public String foo() {
        return foo;
    }
}