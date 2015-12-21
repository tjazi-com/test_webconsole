package com.tjazi.test.console.controller;

import com.tjazi.profilescreator.client.ProfilesCreatorClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.UUID;

/**
 * Created by Krzysztof Wasiak on 18/12/2015.
 */

@Controller
public class HomeController {

    @Autowired
    private ProfilesCreatorClient profilesCreatorClient;

    @RequestMapping(value = {"/", "index", "index.html"}, method = RequestMethod.GET)
    public String index(Model model) {

        return "index";
    }

    @RequestMapping(value = "/registerprofile", method = RequestMethod.POST)
    public String registerProfile(Model model) {

        String sampleUserName = "SampleName" + UUID.randomUUID().toString();
        String sampleEmail = "Sample@email.com.pl" + UUID.randomUUID().toString();
        String samplePasswordHash = "SamplePasswd" + UUID.randomUUID().toString();

        profilesCreatorClient.createBasicProfile(sampleUserName, sampleEmail, samplePasswordHash);

        return "index";
    }
}
