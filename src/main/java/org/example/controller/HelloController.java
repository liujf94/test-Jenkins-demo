package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Slf4j
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        log.info("调用hello方法");
        return "你好啊 "+new Date();
    }
}
