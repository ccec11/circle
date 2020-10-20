package top.geminix.circle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.geminix.circle.dao.ICircleInfoDao;
import top.geminix.circle.domain.CircleInfo;
import top.geminix.circle.service.ICircleInfoService;

import java.util.List;

@Service
@Transactional
public class CircleInfoServiceImpl implements ICircleInfoService {
    @Autowired
    private ICircleInfoDao circleInfoDao;

    @Override
    public List<CircleInfo> getReportedCircleInfo() {
        return circleInfoDao.getReportedCircleInfo();
    }

    @Override
    public List<CircleInfo> getBannedCircleInfo(String circleStatus) {
        return circleInfoDao.getBannedCircleInfo(circleStatus);
    }

    @Override
    public boolean modiCircleStatusToBanned(CircleInfo circleInfo) {
        return circleInfoDao.modiCircleStatusToBanned(circleInfo);
    }

    @Override
    public boolean modiCircleStatusToNormal(CircleInfo circleInfo) {
        return circleInfoDao.modiCircleStatusToNormal(circleInfo);
    }
}
