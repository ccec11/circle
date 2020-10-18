package top.geminix.circle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.geminix.circle.dao.IAdminInfoDao;
import top.geminix.circle.domain.AdminInfo;
import top.geminix.circle.service.IAdminInfoService;

@Service
//@Transactional
public class AdminInfoService implements IAdminInfoService {
    @Autowired
    private IAdminInfoDao adminInfoDao;

    @Override
    public AdminInfo findAdminInfo(String adminName, String adminPassword) {
        return adminInfoDao.findAdminInfo(adminName,adminPassword);
    }
}
