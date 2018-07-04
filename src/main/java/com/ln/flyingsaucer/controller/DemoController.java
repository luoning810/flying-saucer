package com.ln.flyingsaucer.controller;

import com.ln.flyingsaucer.model.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:测试
 * @author: luoning
 * @date: 2018/7/4 15:36
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    private final Logger logger = LoggerFactory.getLogger(getClass().getName());


    @GetMapping("hello_world")
    public Object sayHelloWorld(String name) {
        System.out.println("请求参数" + name);
        UserVO userVO = new UserVO();
        userVO.setName(name);
        logger.info("返回结果，userVo={}", userVO);
        return userVO;
    }
}
