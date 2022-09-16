package com.example.mysp.web.home;

import com.example.mysp.web.vo.HelloResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/vo")
    public HelloResponse getHelloVo(HelloResponse hr) {
        return hr;
    }
}
