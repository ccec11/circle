package top.geminix.circle.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private int userId;
    private String useAccount;//注意：此处使用Account而不是userName！
    private String userPassword;
    private String userImagePath;//头像url
    private String userSex;//性别
    private int userTelephone;
    private int userStatus;//用户状态 0=已封禁   1=正常
    private String userStatusStr;

    private int reportedRecord;//违规被举报情况？
//    这个应该在第三张表里面  多对多的关系？




}
