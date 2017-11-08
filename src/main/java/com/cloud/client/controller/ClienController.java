package com.cloud.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xingguanghui
 * @create 2017-11-08 17:20
 **/
@Controller
public class ClienController {
    Logger logger  = LoggerFactory.getLogger(ClienController.class);
    @Value("${server.port}")
    String port;
    @ResponseBody
    @RequestMapping("/hi")
    public String home(@RequestParam String n) {
        logger.info("hi "+n+",i am from port:" +port);
        return "hi "+n+",i am from port:" +port;
    }
}
