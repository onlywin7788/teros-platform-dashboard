package com.teros.dashboard.controller.page.apiservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class APIServicePageController {

    @GetMapping("/APIService/development/project")
    public String APIServiceProjectIndex(Model model) {
        return "contents/APIService/development/project/index";
    }

    @GetMapping("/APIService/development/api")
    public String APIServiceAPIIndex(Model model) {
        return "contents/APIService/development/api/index";
    }

    @GetMapping("/APIService/development/api/create")
    public String APIServiceAPICreateIndex(Model model) {
        return "contents/APIService/development/api/create/index";
    }

    @GetMapping("/APIService/development/api/create/module/method")
    public String APIServiceAPICreateModuleMethod(Model model) {
        return "contents/APIService/development/api/create/module/method";
    }


    @GetMapping("/api-development/api/contents/{id}")
    public String developmentUpdate(Model model, @PathVariable long id) {
        model.addAttribute("id", id);
        model.addAttribute("update", 1);

        return "contents/api_dev/api/contents/index";
    }



    // PAGE : API_PLAN
    @GetMapping("/api-development/api-policy")
    public String apiPlan(Model model) {
        return "contents/api_dev/api_policy/index";
    }

    // PAGE : API_DEPLOY
    @GetMapping("/api-development/api-deploy")
    public String apiDeploy(Model model) {
        return "contents/api_dev/api_deploy/index";
    }
}
