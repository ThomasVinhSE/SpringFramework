package vinhnq27.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"", "/", "index.html"})
    public String index() {
        return "welcome";
    }
    @RequestMapping("/oups")
    public String oops() {
        return "noimplemented";
    }
}
