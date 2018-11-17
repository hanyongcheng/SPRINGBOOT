package com.hanyong.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Quick2Controller {

    @RequestMapping("/quick2")
    public String quick2(){
        return "你好啊！quick2";
    }
}
