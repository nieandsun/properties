package com.nrsc.properties.properties2;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(Unions.class)
public class SecurityCoreConfig {
}
