package top.geminix.circle.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CircleInfo {
    private String circleId;
    private String circleName;
    private String circleDescription;//简介
    private String circleImagePath;//圈子头像路径
    private Date submitDate;//提交时间
    private String submitDateStr;//字符串形式 用util转换成str

    private int circleStatus;//封禁圈子 状态 0=待审核   1=正常  -1=已封禁
    private String circleStatusStr;

    private String circleHeat;//圈子热度 暂不定义
    private UserInfo userInfo;//申请人 哪个用户？把id传进来
    private LabelInfo labelInfo;


}
