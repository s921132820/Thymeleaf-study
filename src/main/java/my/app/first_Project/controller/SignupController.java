package my.app.first_Project.controller;

import my.app.first_Project.dto.Email;
import my.app.first_Project.dto.Gender;
import my.app.first_Project.dto.Language;
import my.app.first_Project.dto.SignupInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignupController {
    @GetMapping("signup")
    public String signup (Model model) {
        model.addAttribute("signupInfo", new SignupInfo());
        return "/form/signupView";
    }

    @ModelAttribute("gender")
    private Gender[] gender() {
        return Gender.values();
    }

    @ModelAttribute("email")
    private Email[] email() {
        return Email.values();
    }

    @GetMapping("signup-result")
    public String result () {
        return "/form/signupResult";
    }

    @PostMapping("sendSignup")
    public String sendData (
        @ModelAttribute SignupInfo signupInfo
    ) {
      return "/form/signupResult";
    }
}
