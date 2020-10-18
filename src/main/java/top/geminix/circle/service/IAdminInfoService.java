package top.geminix.circle.service;


import top.geminix.circle.domain.AdminInfo;

/**
 * @Author: Xia Shuang
 * @Date: 20/09/16
 * @Version: 1.0
 */


public interface IAdminInfoService {


    AdminInfo findAdminInfo(String adminName, String adminPassword);

}
