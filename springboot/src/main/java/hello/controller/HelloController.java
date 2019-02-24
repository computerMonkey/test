package hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/helloWorld")
    public String helloWorld(){
        System.out.println("helloWorld");
        return "helloWorld";
    }
}
