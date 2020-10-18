package top.geminix.circle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.geminix.circle.dao.IBadWordInfoDao;
import top.geminix.circle.domain.BadWordInfo;
import top.geminix.circle.service.IBadWordInfoService;

import java.util.List;

@Service
@Transactional
public class BadWordInfoService implements IBadWordInfoService {

    @Autowired
    private IBadWordInfoDao badWordInfoDao;

    /**
     * 查询所有的敏感词 返回List
     * @return
     */
    @Override
    public List<BadWordInfo> findAll() {
        return badWordInfoDao.findAll();
    }

    @Override
    public boolean addBadWordInfo(String badWordContent) {
        return badWordInfoDao.addBadWordInfo(badWordContent);
    }

    @Override
    public boolean removeBadWordInfo(String badWordId) {
        return badWordInfoDao.removeBadWordInfo(badWordId);
    }
}
