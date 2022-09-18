package com.StartThe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;


/**
 * Date: 2021/9/22 4:04 下午
 * com.StartThe.HelloController
 * Describe：
 */
@ApiIgnore
@RestController
public class HelloController {



    @GetMapping("/test")
    public Object hell(){
        return "ok";
    }


}