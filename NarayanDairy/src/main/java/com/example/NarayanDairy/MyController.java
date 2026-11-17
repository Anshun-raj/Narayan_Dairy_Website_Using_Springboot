package com.example.NarayanDairy;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController
{
    @GetMapping("/")
    public String getHomePage(Model model)
    {
        model.addAttribute("Quote1","Growing up on a dairy farm, you certainly learn discipline and a commitment to purpose.");
        return "Home";
    }

    @GetMapping("/home")
    public String getHomePage1(Model model)
    {
        model.addAttribute("Quote1","Growing up on a dairy farm, you certainly learn discipline and a commitment to purpose.");
        model.addAttribute("Quote2","Lorem ipsum dolor sit amet, consectetur adipiscing elit,sed do eiusmod");
        return "Home";
    }

    @GetMapping("/about")
    public String getAboutPage(Model model)
    {
        model.addAttribute("Title","About Us");
        model.addAttribute("Quality","Best Quality");
        model.addAttribute("Award","Award Winning");
        return "About";
    }

    @GetMapping("/product")
    public String getProductPage(Model model)
    {
        model.addAttribute("Title","Our Product");
        model.addAttribute("product1","Dahi");
        model.addAttribute("product2","Milk");
        model.addAttribute("product3","Lassi");
        return "Product";
    }

    @GetMapping("/review")
    public String getReviewPage(Model model)
    {
        model.addAttribute("Title","Our Reviewer");
        model.addAttribute("reviewer1","Micheal Stark");
        model.addAttribute("reviewer2","Roman Reign");
        model.addAttribute("reviewer3","Dwarne Bravo");
        return "Review";
    }

    @GetMapping("/contact")
    public String getContactPage(Model model)
    {
        model.addAttribute("Title","Contact Us");
        return "Contact";
    }



}
