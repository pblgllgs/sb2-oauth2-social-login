package com.pblgllgs.sb3oauth2sociallogin.controller;
/*
 *
 * @author pblgl
 * Created on 05-02-2024
 *
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPageController {

    @GetMapping("/")
    public String displayIndexPage(Model model){
         return "index";
    }
}
