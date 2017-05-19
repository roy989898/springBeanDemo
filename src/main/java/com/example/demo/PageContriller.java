package com.example.demo;

import com.example.abc.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pomingpo on 2017/5/18.
 */
@RestController
public class PageContriller {

    //    @Autowired
    private NotificationService notificatioServices;

    //    @Autowired
    public void setNotificatioServices(NotificationService notificatioServices) {
        this.notificatioServices = notificatioServices;
    }

    @Autowired
    public PageContriller(NotificationService notificatioServices) {
        this.notificatioServices = notificatioServices;
    }

    @RequestMapping("/")
    public String home() {
        return notificatioServices.toString();
    }

}
