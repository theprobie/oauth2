package oauth2github.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloOauthController {

    @GetMapping("/admin/hello")
    public String admin(){
        return "hello admin";
    }

    @GetMapping("/user/hello")
    public String user(){
        return "hello user";
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
