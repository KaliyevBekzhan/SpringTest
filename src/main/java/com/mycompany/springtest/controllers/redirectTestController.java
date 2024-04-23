/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.mycompany.springtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author rekal
 */
@Controller
public class redirectTestController {
    
    @RequestMapping("/button")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "redirectTest";
    }
    
}
