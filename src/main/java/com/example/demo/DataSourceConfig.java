package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pomingpo on 2017/5/21.
 */
@Configuration
public class DataSourceConfig {

    @Bean
    DataSource dataSource() {
        return new DataSource("myurl", 9999);
    }
}
