package com.madive.bigcommerce.madiveone.admin.biz.test;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {
    @GetMapping("/my-endpoint")
    public String myEndpoint(HttpServletRequest request) {
        String action = request.getParameter("action");
        // Use the 'action' parameter as needed
        return "Action: " + action;
    }
    @GetMapping("/my-endpoint2")
    public String myEndpoint(@RequestParam("actions") List<String> actionList) {
        return "Action: " + actionList.toString();
    }
}
