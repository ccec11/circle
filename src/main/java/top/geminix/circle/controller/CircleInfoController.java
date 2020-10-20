package top.geminix.circle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.geminix.circle.domain.CircleInfo;
import top.geminix.circle.service.ICircleInfoService;

import java.util.List;

@Controller
@RequestMapping("/circle")
public class CircleInfoController {
    @Autowired
    private ICircleInfoService circleInfoService;

    @RequestMapping("getReported.do")
    public ModelAndView getReportedCircleInfo() {
        ModelAndView mv = new ModelAndView();
        List<CircleInfo> reportedCircleList = circleInfoService.getReportedCircleInfo();
        mv.addObject("", reportedCircleList);
        mv.setViewName("");
        return mv;
    }

    @RequestMapping("getBanned.do")
    public ModelAndView getBannedCircleInfo(String circleStatus) {
        ModelAndView mv = new ModelAndView();
        List<CircleInfo> bannedCircleList = circleInfoService.getBannedCircleInfo(circleStatus);

        mv.addObject("", bannedCircleList);
//        mv.setViewName();
        return mv;
    }
    @RequestMapping("ban.do")
    public String modiCircleStatusToBanned(CircleInfo circleInfo) {
        boolean result = circleInfoService.modiCircleStatusToBanned(circleInfo);
//        对result进行判断
        return "redirect:manageCircle.jsp";//执行成功
    }

    @RequestMapping("unban.do")
    public String modiCircleStatusToNormal(CircleInfo circleInfo) {
        boolean result = circleInfoService.modiCircleStatusToNormal(circleInfo);
//        对result进行判断
        return "redirect:manageCircle.jsp";//执行成功
    }

}
