package com.nrsc.properties.properties1;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "nrsc.security")
public class SecurityProperties {
    private BrowserProperties browser = new BrowserProperties();
    private AppProperties app = new AppProperties();
}
