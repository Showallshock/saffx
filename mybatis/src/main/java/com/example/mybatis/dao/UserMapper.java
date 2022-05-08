package com.example.mybatis.dao;

import com.example.mybatis.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository     //被spring接管
@Mapper            //表示本类是一个MyBatis里的Mapper
public interface UserMapper {
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(int id);

    //添加一个用户
    int addUser(User user);

    int addUser2(Map map);

    //修改一个用户
    int updateUser(User user);

    //删除一个用户
    int deleteUser(int id);

    User getUserById2(int i);
}
