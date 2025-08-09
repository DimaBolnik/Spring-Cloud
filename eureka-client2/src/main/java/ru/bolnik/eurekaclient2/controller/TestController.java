package ru.bolnik.eurekaclient2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main2")
public class TestController {

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @Value("${test.var}")
    private String var;

    @GetMapping("/test2")
    public String test() {
        return instanceId + "::" + var;
    }
}
