package com.gmall.gmall.user.mapper;

import com.gmall.gmall.user.bean.UmsMember;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UmsMemberMapper {

    int deleteByPrimaryKey(Long id);


    int insert(UmsMember record);

    int insertSelective(UmsMember record);

    UmsMember selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsMember record);

    int updateByPrimaryKey(UmsMember record);

    @Select("select * from ums_member")
    List<UmsMember> getUser();
}