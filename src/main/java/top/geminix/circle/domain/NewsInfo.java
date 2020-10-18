package top.geminix.circle.domain;

import java.util.Date;

/**
 * newsInfoList  资讯信息表
 */

public class NewsInfo {
    private String newsId;
    private String newsTitle;
    private String newsContent;
    private String newsImagePath;


    private String newsLabel;//待讨论字段 这个标签是独立的吗
    private float badWordPercentage;//敏感词频率字段 float

    private int newsStatus;//1=? 0=?
    private String newsStatusStr;
    private Date releaseDate;//发布时间
    private String releaseDateStr;//发布时间

//getter and setter



}
