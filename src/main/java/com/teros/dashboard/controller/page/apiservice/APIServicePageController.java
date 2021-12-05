package com.teros.dashboard.controller.page.apiservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class APIServicePageController {

    // API Development
    @GetMapping("/api-service/development/project")
    public String APIServiceProjectIndex(Model model) {
        return "contents/api-service/development/project/index";
    }

    @GetMapping("/api-service/development/api")
    public String APIServiceAPIIndex(Model model) {
        return "contents/api-service/development/api/index";
    }

    @GetMapping("/api-service/development/api/create")
    public String APIServiceAPICreateIndex(Model model) {
        return "contents/api-service/development/api/create/index";
    }

    @GetMapping("/api-service/group")
    public String APIServiceAPIGroup(Model model) {
        return "contents/api-service/group/index";
    }

    @GetMapping("/api-service/policy")
    public String APIServiceAPIPolicy(Model model) {
        return "contents/api-service/policy/index";
    }
}
