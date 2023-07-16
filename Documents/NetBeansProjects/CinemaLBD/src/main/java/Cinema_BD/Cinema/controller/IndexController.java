package Cinema_BD.Cinema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index.html")
    public String redirectToIndex() {
        return "redirect:/";
    }
}
