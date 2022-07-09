package SenierProject.SeeFood.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String getTest() {
        return "ok";
    }

    @PostMapping("/test")
    public String postTest() {
        return "ok";
    }
}
