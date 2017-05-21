package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pomingpo on 2017/5/21.
 */
@RestController
public class PageController {

    @Value("${spring.profiles.active}")
    private String environment;

    @RequestMapping("/")
    public String home() {
        return environment;
    }
}
