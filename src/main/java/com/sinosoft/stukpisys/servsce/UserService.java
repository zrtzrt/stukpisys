package com.sinosoft.stukpisys.servsce;

import com.sinosoft.stukpisys.entity.Education;
import com.sinosoft.stukpisys.entity.User;
import com.sinosoft.stukpisys.entity.UserInfo;

import java.util.List;

public interface UserService {
    /**
     * 用户登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 操作结果
     */
    String login(String username, String password);

    /**
     * 用户注册
     *
     * @param user 用户信息
     * @return 操作结果
     */
    String register(User user);

    /**
     * 刷新密钥
     *
     * @param oldToken 原密钥
     * @return 新密钥
     */
    String refreshToken(String oldToken);

    /**
     * 查询所有实习生信息
     * @return  List<UserInfo>
     */
    List<UserInfo> getAllInfo();

    /**
     * 查询所有实习生学历信息
     * @return  List<UserInfo>
     */
    List<Education> getEduInfo();
}
