package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class HomeController {

    @Autowired
    ResumeRepository resumeRepository;

    @RequestMapping("/")
    public String listResumes(Model model){
        model.addAttribute("resumes", resumeRepository.findAll() );
        return "list";
    }

    @GetMapping("/add")
    public String resumeform(Model model){
        model.addAttribute("resume", new Resume());
        return "resumeform";
    }

    @PostMapping("/process")
    public String processForm(@Valid @ModelAttribute("resume") Resume resume, BindingResult result)
    {
        if (result.hasErrors()){
            return "resumeform";
        }
        resumeRepository.save(resume);
        return "redirect:/";
    }
}

