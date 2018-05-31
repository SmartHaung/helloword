package com.example.helloword.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: huangwenbin
 * @description:
 * @date: 2018/5/31 22:43
 * @version: 1.0.0.0
 * @modified by: huangwenbin
 */
@RestController
public class HelloWordController {
    @RequestMapping("hello")
    public String hello() {
        return "hello world";
    }
}
