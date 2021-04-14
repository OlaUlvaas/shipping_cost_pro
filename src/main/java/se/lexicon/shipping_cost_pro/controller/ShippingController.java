package se.lexicon.shipping_cost_pro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shipping")
public class ShippingController {

    @GetMapping("/")
    public String getAll(){
        return "boxList";
    }
    @GetMapping("/addForm")
    public String showBoxForm(){
        return "boxForm";
    }
    @PostMapping("/")
    public String addBox(){
        return "redirect:/shipping/";
    }
}
