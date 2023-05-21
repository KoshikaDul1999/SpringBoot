package com.ictec1.SprinBoot.Controller;

import com.ictec1.SprinBoot.Entity.Business;
import com.ictec1.SprinBoot.Repository.BusinessRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ViewController {

    @Autowired
    private BusinessRepo repo;

    @GetMapping("/business")
    public String showBusinessPage(Model model){
        List<Business> all = this.repo.findAll();
        model.addAttribute("all", all);
        return "all_business";
    }

}
