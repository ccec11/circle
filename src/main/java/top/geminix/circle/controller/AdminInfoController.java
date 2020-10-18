package top.geminix.circle.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.geminix.circle.domain.AdminInfo;
import top.geminix.circle.service.IAdminInfoService;

@Controller

public class AdminInfoController {
    @Autowired
    IAdminInfoService adminInfoService;


    @RequestMapping("/login.do")
    public String findAdminInfo(@RequestParam(required = true, name = "adminName") String adminName, @RequestParam(required = true, name = "adminPassword") String adminPassword) {
        AdminInfo adminInfo = adminInfoService.findAdminInfo(adminName, adminPassword);
        if (adminInfo != null) {
            System.out.println("successful=====");
            return "redirect:success.jsp";
        }
        return "redirect:404.jsp";
    }

}


