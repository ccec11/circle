package top.geminix.circle.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.geminix.circle.domain.BadWordInfo;
import top.geminix.circle.service.IBadWordInfoService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BadWordInfoTest {

    @Autowired
    private IBadWordInfoService badWordInfoService;

    @Test
    public void TestGetAll() {
        List<BadWordInfo> all = badWordInfoService.findAll();
        for (BadWordInfo badWordInfo : all) {
            System.out.println(badWordInfo);
        }

    }

    @Test
    public void TestAdd() {
        String bad = "badTestAdd";
        boolean b = badWordInfoService.addBadWordInfo(bad);
        System.out.println("===============");
        TestGetAll();

    }

    @Test
    public void TestRemove() {
        String wordId = "5";
        boolean result = badWordInfoService.removeBadWordInfo(wordId);
        System.out.println("==============="+result);
        TestGetAll();

    }
}
