package top.geminix.circle.service;

import top.geminix.circle.domain.CircleInfo;

import java.util.List;

public interface ICircleInfoService {
    List<CircleInfo> getReportedCircleInfo();

    List<CircleInfo> getBannedCircleInfo(String circleStatus);

    boolean modiCircleStatusToBanned(CircleInfo circleInfo);

    boolean modiCircleStatusToNormal(CircleInfo circleInfo);
}
