package org.newapp.just_for_fun.config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "pizza")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Pizza {
    private String sauce;
    private String topping ;
    private String crust;
}
