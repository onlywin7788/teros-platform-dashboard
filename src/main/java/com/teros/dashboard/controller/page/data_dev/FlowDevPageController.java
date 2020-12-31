package com.teros.dashboard.controller.page.data_dev;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FlowDevPageController {

    @GetMapping("/data-development/flow-dev")
    public String flowDesign(Model model) {
        return "contents/data_dev/flow_dev/index";
    }

    @GetMapping("/data-development/connector")
    public String flowConnector(Model model) {
        return "contents/data_dev/connector/index";
    }

    @GetMapping("/data-development/data-set")
    public String flowDataSet(Model model) {
        return "contents/data_dev/data_set/index";
    }
}