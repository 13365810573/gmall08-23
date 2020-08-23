package com.gmall.gmall.user.service.impl;


import com.gmall.gmall.user.bean.UmsMember;
import com.gmall.gmall.user.mapper.UmsMemberMapper;
import com.gmall.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UmsMemberMapper umsMemberMapper;


    @Override
    public List<UmsMember> getUser()
    {
        List<UmsMember> user = umsMemberMapper.getUser();
        return user;
    }


}
