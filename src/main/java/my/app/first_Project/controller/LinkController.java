package my.app.first_Project.controller;

import my.app.first_Project.dto.UserData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LinkController {
    @GetMapping("/link")
    public String link(Model model) {
        model.addAttribute("name", "장원영");
        model.addAttribute("age", 21);

        // 구두 번호 보내기
        int shoesNumber = 7;
        model.addAttribute("shoesNumber", shoesNumber);
        return "link";
    }

    @GetMapping("/url")
    public String url() {
        return "/link/basicUrl";
    }

    // /getInfo(name=${name},age=${age})

    @GetMapping("/getInfo")
    public String getInfo(@RequestParam("name")String name, @RequestParam("age")int age,
                          Model model

    ) {
        System.out.println(name + "," + age);
        Map<String, UserData> params = new HashMap<>();

        UserData userData = new UserData();
        userData.setUserName(name);
        userData.setUserAge(age);
        model.addAttribute("data", userData);

        return "/link/info";
    }

    // path variable 처리
    @GetMapping("/shoes/detail/{id}")
    public String details(@PathVariable("id")int id, Model model) {
        System.out.println("id = " + id);
        model.addAttribute("id", id);
        return "/link/details";
    }

    //
    // /shoes/(id=${shoesNumber}, name=${name})
    @GetMapping("/shoes/{id}")
    public String selectShoes(@RequestParam("name")String name, @PathVariable("id")String id, Model model) {
        Map<String, String> select = new HashMap<>();
        select.put("name", name);
        select.put("id", id);
        model.addAttribute("map", select);
        return "/link/result";
    }
}
