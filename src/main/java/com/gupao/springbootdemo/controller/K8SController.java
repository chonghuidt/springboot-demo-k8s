package com.gupao.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class K8SController {

    /**
     * zichang
     * @return
     */
    @RequestMapping("/k8s")
    public String k8s(){
        return "hello K8 lipeng ";
    }
}
