package com.study.deploy_back.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${client.address}") // yml 의 client.address의 주소를 가지고 옴
    private String clientAddress;

    @CrossOrigin
    @GetMapping("/test")
    public ResponseEntity<?> test() {
        return ResponseEntity.ok(clientAddress + "테스트!");
    }
}
