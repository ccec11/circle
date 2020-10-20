package top.geminix.circle.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import top.geminix.circle.domain.CircleInfo;

import java.util.List;

public interface ICircleInfoDao {

    @Select("select * from 中间表")
    List<CircleInfo> getReportedCircleInfo();

    @Select("select * from circleinfo where circleStatus = #{circleStatus}")
    List<CircleInfo> getBannedCircleInfo(@Param("circleStatus") String circleStatus);

//    @Update("#{}") 如何获得属性
    boolean modiCircleStatusToBanned(CircleInfo circleInfo);

//    @Update("")
    boolean modiCircleStatusToNormal(CircleInfo circleInfo);
}
