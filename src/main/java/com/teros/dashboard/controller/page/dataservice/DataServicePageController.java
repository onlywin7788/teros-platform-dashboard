package com.teros.dashboard.controller.page.dataservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DataServicePageController {

    @GetMapping("/data-service/development/project")
    public String DataServiceProjectIndex(Model model) {
        return "contents/data-service/development/project/index";
    }

    @GetMapping("/data-service/development/interface")
    public String DataServiceInterfaceIndex(Model model) {
        return "contents/data-service/development/interface/index";
    }

    // exec-group
    @GetMapping("/data-development/flow-group")
    public String executionGroup(Model model) {
        return "contents/data_dev/flow_group/flow_group";
    }

    // exec-group
    @GetMapping("/data-development/exec-group-flow-map")
    public String executionGroupFlowMap(Model model) {
        return "contents/data_dev/flow_group/exec_group_flow_map";
    }

    // flow-deploy
    @GetMapping("/data-development/flow-deploy")
    public String flowDeploy(Model model) {
        return "contents/data_dev/flow_deploy/index";
    }


    @GetMapping("/data-development/flow-design/create")
    public String flowDDesignCreate(Model model) {
        model.addAttribute("update", 0);
        return "contents/data_dev/flow_dev/design/index";
    }

    @GetMapping("/data-development/flow-design/{id}")
    public String flowDesignUpdate(Model model, @PathVariable long id) {
        model.addAttribute("id", id);
        model.addAttribute("update", 1);
        return "contents/data_dev/flow_dev/design/index";
    }

    @GetMapping("/data-service/connector")
    public String APIServiceAPIGroup(Model model) {
        return "contents/data-service/connector/index";
    }

    @GetMapping("/data-service/data-set")
    public String APIServiceAPIPolicy(Model model) {
        return "contents/data-service/data-set/index";
    }

}
