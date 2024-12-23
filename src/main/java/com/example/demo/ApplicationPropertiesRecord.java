package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @param foo Must be filled in.
 */
@ConfigurationProperties(prefix = "app-record")
//@Validated // Validation enables startup-time safety!
public record ApplicationPropertiesRecord(
        String foo) {
}