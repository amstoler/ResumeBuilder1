package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    ResumeRepository resumeRepository;

    @RequestMapping("/")
    public String listResumes(Model model){
        model.addAttribute("resume", resumeRepository.findAll() );
        return "list";
    }
}
