package my.app.first_Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/articles")
public class ArticlesController {
    @GetMapping("/main")
    public String main() {
        return "articles/main";
    }

    @GetMapping("/list")
    public String list() {
        return "articles/list_all";
    }

    @GetMapping("/{id}")
    public String id(@PathVariable("id")int id, Model model) {
        model.addAttribute("id", id);
        return "/articles/list_one";
    }
}