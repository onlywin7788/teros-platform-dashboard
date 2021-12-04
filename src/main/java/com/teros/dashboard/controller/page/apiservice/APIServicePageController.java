package com.teros.dashboard.controller.page.apiservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class APIServicePageController {

    @GetMapping("/APIService/development/project")
    public String APIServiceDevProjectIndex(Model model) {
        return "contents/APIService/development/project/index";
    }

    @GetMapping("/api-development/api/contents/create")
    public String developmentCreate(Model model) {
        model.addAttribute("update", 0);
        return "contents/api_dev/api/contents/index";
    }

    @GetMapping("/api-development/api/contents/{id}")
    public String developmentUpdate(Model model, @PathVariable long id) {
        model.addAttribute("id", id);
        model.addAttribute("update", 1);

        return "contents/api_dev/api/contents/index";
    }

    @GetMapping("/api-development/api/contents/module/method")
    public String developmentAPIModuleInputMethod(Model model) {
        return "contents/api_dev/api/contents/module/method";
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
