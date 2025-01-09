package com.lzy.controller;

import com.lzy.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther jerry
 * @date 8/1/2025 5:06 PM
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    public TestServiceImpl testService;

    @RequestMapping("/update")
    public String update(){
        return testService.update();
    }

}
