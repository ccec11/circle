package top.geminix.circle.domain;

import java.util.Date;

public class CircleInfo {
    private String circleId;
    private String circleName;
    private String circleDescription;//简介
    private String circleImagePath;
    private Date submitDate;//提交时间
    private String submitDateStr;//字符串形式 用util转换成str

    private int circleStatus;//封禁圈子 状态 0=待审核   1=正常  -1=已封禁
    private String circleStatusStr;

    private String 圈子热度;//怎么弄？
    private UserInfo userInfo;//申请人 哪个用户？把id传进来
    private LabelInfo labelInfo;


}
