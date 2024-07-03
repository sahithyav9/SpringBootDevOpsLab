package com.example.static_webpage;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
   @Value("${ENVIRONMENT:unknown}")
   private String environment;
   @GetMapping("/")
   public String home(Model model) {
       model.addAttribute("environment", environment);
       return "index";
   }
}
