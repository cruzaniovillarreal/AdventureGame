package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class IndexController {

    public IndexController() {
    }

    @GetMapping("/index")
    @ResponseBody
    public String indexPage() {
        return "index";
    }


}
