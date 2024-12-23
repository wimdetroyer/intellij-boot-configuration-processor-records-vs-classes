package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @param foo Must be filled in.
 */
@ConfigurationProperties(prefix = "app-record")
public record ApplicationPropertiesRecord(
        String foo) {
}