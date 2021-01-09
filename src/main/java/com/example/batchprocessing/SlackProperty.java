package com.example.batchprocessing;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("slack")
public class SlackProperty {
    public final String webhookUrl;
    SlackProperty(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }
}
