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


    @RequestMapping("getAll.do")
    public ModelAndView getAllBadWord() {
        ModelAndView mv = new ModelAndView();
        List<BadWordInfo> allBadWord = badWordInfoService.getAllBadWord();
        mv.addObject("allBadWord",allBadWord);
        //交给试图解析器完成
        mv.setViewName("");
        return mv;
    }


    @RequestMapping("add.do")
    public String addBadWordInfo(@RequestParam(name = "badWordContent")String badWordContent) {
        boolean addResult = badWordInfoService.addBadWordInfo(badWordContent);
        System.out.println(addResult);

        return "redirect:getAllBadWord.do";
    }

    @RequestMapping("remove.do")
    public String removeBadWordInfo(@RequestParam(name = "badWordId")String badWordId) {

        boolean removeResult = badWordInfoService.removeBadWordInfo(badWordId);
        System.out.println(removeResult);

        return "redirect:getAllBadWord.do";
    }


}
