package com.sierraone.javaapp.resources;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {

    @GetMapping("/home")
    public String showHomePage() {
        return "home"; // This should match the name of your HTML file (without the .html extension)
    }
    
    @GetMapping("/validate")
    public String showValidateFile() {
        return "validate";
    }
    
    @GetMapping("/login")
    public String showLoginFile() {
        return "login"; 
    }
    
    @GetMapping("/register")
    public String showRegistrationFile() {
        return "register"; 
    }
    
    @GetMapping("/details")
    public String showDetailsFile() {
        return "details"; 
    }
}
