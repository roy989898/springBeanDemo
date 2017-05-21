package com.example.demo;

import com.example.abc.NotificationService;
import com.example.abc.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pomingpo on 2017/5/18.
 */
@RestController
public class PageController {

    @Value("${my.secret}")
    private String pageContoleerMSG;
    private final User user;
    //    @Autowired
    private NotificationService notificatioServices;

    //    @Autowired
    public void setNotificatioServices(NotificationService notificatioServices) {
        this.notificatioServices = notificatioServices;
    }

    @Autowired
    public PageController(NotificationService notificatioServices, User user2) {
        this.notificatioServices = notificatioServices;
        this.user = user2;
    }

    @RequestMapping("/")
    public String home() {
        return pageContoleerMSG;
    }

}
