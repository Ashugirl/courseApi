package be.intecbrussel.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi(){
        return "Hello";
    }

// request mapping with just a "/" allows something to be put directly on main page
    @RequestMapping("/")
    public String sayHello(){
        return "Howdy";
    }

}
