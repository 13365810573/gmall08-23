package com.gmall.gmall.user.service;

import com.gmall.gmall.user.bean.UmsMember;


import java.util.List;


public interface UserService {
    /**
     * 获取用户列表
     * @return
     */
    List<UmsMember> getUser();


}
