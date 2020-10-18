package top.geminix.circle.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import top.geminix.circle.domain.BadWordInfo;
import top.geminix.circle.service.IBadWordInfoService;

import java.util.List;


@Controller
@RequestMapping("/badWord")
public class BadWordInfoController {

    @Autowired
    private IBadWordInfoService badWordInfoService;


    @RequestMapping("findAll.do")
    public ModelAndView findAllBadWord() {
        ModelAndView mv = new ModelAndView();
        List<BadWordInfo> allBadWord = badWordInfoService.findAll();
        for (BadWordInfo badWordInfo : allBadWord) {
            System.out.println("===========");
            System.out.println(badWordInfo);
        }

//        mv.addObject("allBadWord",allBadWord);
//        mv.setViewName("");
        return null;
    }


    @RequestMapping("add.do")
    public String addBadWordInfo(@RequestParam(name = "badWordContent")String badWordContent) {

        boolean addResult = badWordInfoService.addBadWordInfo(badWordContent);
        System.out.println(addResult);

//        return "redirect:findAll.do";
        return null;

    }

    @RequestMapping("remove.do")
    public String removeBadWordInfo(@RequestParam(name = "badWordId")String badWordId) {

        boolean removeResult = badWordInfoService.removeBadWordInfo(badWordId);
        System.out.println(removeResult);

//        return "redirect:findAll.do";
        return null;

    }

    @RequestMapping("modify.do")
    public String modifyBadWordInfo() {



//        return "redirect:findAll.do";
        return null;

    }


}
