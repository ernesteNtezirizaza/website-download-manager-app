package rw.ac.rca.WebsiteDownloadManager.client.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class UrlController {
    @GetMapping
    public String mainEntry(){
        return "Url";
    }

    @GetMapping("/report")
    public String report() {
        return "Report";
    }

    @PostMapping("/download")
    public String login(HttpServletRequest request, Model model, HttpSession session){

        return "redirect:/report";
    }

}
