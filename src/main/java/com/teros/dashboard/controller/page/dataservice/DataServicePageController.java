package com.teros.dashboard.controller.page.dataservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DataServicePageController {

    @GetMapping("/data-service/development/project")
    public String projectIndex(Model model) {
        return "contents/data-service/development/project/index";
    }

    @GetMapping("/data-service/development/interface")
    public String interfaceIndex(Model model) {
        return "contents/data-service/development/interface/index";
    }

    @GetMapping("/data-service/development/interface/design")
    public String DataServiceInterfaceDesignIndex(Model model) {
        return "contents/data-service/development/interface/design/index";
    }

    @GetMapping("/data-service/development/interface/design/{id}")
    public String interfaceDesignUpdateIndex(Model model, @PathVariable long id) {
        model.addAttribute("id", id);
        model.addAttribute("update", 1);
        return "contents/data-service/development/interface/design/index";
    }

    // interface-group-management
    @GetMapping("/data-service/interface-group")
    public String interfaceGroup(Model model) {
        return "contents/data-service/group/management/index";
    }

    // interface-group-mapping
    @GetMapping("/data-service/interface-group-map")
    public String interfaceGroupMap(Model model) {
        return "contents/data-service/group/mapping/index";
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

    @GetMapping("/data-service/connector")
    public String APIServiceAPIGroup(Model model) {
        return "contents/data-service/connector/index";
    }

    @GetMapping("/data-service/data-set")
    public String APIServiceAPIPolicy(Model model) {
        return "contents/data-service/data-set/index";
    }

}
