package com.tjazi.test.console.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Krzysztof Wasiak on 18/12/2015.
 */

@Controller
public class HomeController {

    @RequestMapping(value = {"/", "index", "index.html"}, method = RequestMethod.GET)
    public String index(Model model) {

        return "index";
    }

    @RequestMapping(value = "/registerprofile", method = RequestMethod.POST)
    public String registerProfile(Model model) {
        return "index";
    }
}
