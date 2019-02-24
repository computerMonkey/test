package hello.controller;

import hello.pojo.Demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/helloWorld")
    public String helloWorld(){
        System.out.println("helloWorld");
        return "helloWorld";
    }

    @GetMapping("/getDemo")
    public Demo getDemo(){
        return new Demo("xxs", 11);
    }
}
