package hello.controller;

import hello.pojo.Demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("hello2")
public class HelloController2 {

    @RequestMapping("/helloWorld")
    public String helloWorld(){
        return "helloWorld4";
    }

    @RequestMapping("/helloWorld5")
    public String helloWorld5(){
        return "helloWorld5";
    }

    @GetMapping("/getDemo")
    public Demo getDemo(){
        return new Demo("xxs2", 11, new Date());
    }
}
