package com.docker.github.actions.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class AppTestController {

    private final static Logger LOGGER =
            LoggerFactory.getLogger(AppTestController.class);

    public ResponseEntity<String> appTest(){
        LOGGER.info("CONTROLLER : AppTestController : appTest...!!!");

        return ResponseEntity.ok("Application working fine...!!!");
    }
}
