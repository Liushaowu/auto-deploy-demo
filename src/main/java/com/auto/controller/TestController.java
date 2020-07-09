package com.auto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description web测试
 * Date 2020/7/9
 *
 * @author Liushaowu
 * @since 1.0.0
 */
@RestController
@RequestMapping("/docker")
public class TestController {
    @GetMapping("/test")
    public String test() {
        return "docker test success";
    }
}
