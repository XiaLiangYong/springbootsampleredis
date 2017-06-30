package com.example.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alibeibei on 2017/6/30.
 */
@RestController
public class HelloController {

    @RequestMapping("/getDemo")
    public String hello(String id) {
        return id;
    }
}
