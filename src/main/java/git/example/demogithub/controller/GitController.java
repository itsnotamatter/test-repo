package git.example.demogithub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GitController {

    @GetMapping("/user")
    public String user() {
        return "User";//comment test
    }

    @GetMapping("/admin")
    public String admin() {
        return "Admin";
    }


}
