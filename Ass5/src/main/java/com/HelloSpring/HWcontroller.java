package com.HelloSpring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
/**
 * 
 * @author javacodepoint
 *
 */
@RestController
public class HWcontroller {
    @RequestMapping("/hw3")
    public String hw() {
        return "Hello World!";
    }
}
