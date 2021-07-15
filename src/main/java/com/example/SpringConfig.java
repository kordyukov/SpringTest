package com.example;

import com.example.SpringTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

/**
 * @author Neil Alishev
 */
@Configuration
public class SpringConfig {
    @Bean
    @Scope("singleton")
    public SpringTest springTest() {
        return new SpringTest();
    }


}
