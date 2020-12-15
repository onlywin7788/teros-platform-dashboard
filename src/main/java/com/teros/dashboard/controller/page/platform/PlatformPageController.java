package com.teros.dashboard.controller.page.platform;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlatformPageController {

    @GetMapping("/platform/application/overview")
    public String overview(Model model) {
        return "contents/platform/application/overview";
    }

    @GetMapping("/platform/application/api")
    public String apiMgmt(Model model) { return "contents/platform/application/api_mgmt"; }

    @GetMapping("/platform/application/data")
    public String dataMgmt(Model model) {
        return "contents/platform/application/data_mgmt";
    }

    @GetMapping("/platform/services")
    public String services(Model model) {
        return "contents/platform/services/index";
    }
}
