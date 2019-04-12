package com.bell.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Контроллер, проверяющий соединение
 */
@RestController
public class PingController {

    @RequestMapping("/ping")
    public String ping() {
        return "pong";
    }
}
