package com.xincdata.community.community.mapper;

import com.xincdata.community.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "userMapper")
public interface UserMapper {
    @Insert("insert into user (name, token, account_id, gmt_create, gmt_modified) values (#{name}, #{token}, #{accountId}, #{gmtCreate}, #{gmtModified})")
    void insert(User user);
}
