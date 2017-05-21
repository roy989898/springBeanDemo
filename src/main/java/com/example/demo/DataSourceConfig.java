package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by pomingpo on 2017/5/21.
 */
@Configuration
public class DataSourceConfig {

    @Bean(name = "datasource")
    @Profile("development")
    DataSource development() {
        return new DataSource("my-dev-url", 9999);
    }


    @Bean(name = "datasource")
    @Profile("production")
    DataSource production() {
        return new DataSource("my-production-url", 9999);
    }
}
