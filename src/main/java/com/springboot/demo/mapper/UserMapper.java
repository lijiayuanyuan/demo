package com.springboot.demo.mapper;

import com.springboot.demo.domain.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from t_user")
    @Results({@Result(property = "userId", column = "user_id")
            ,@Result(property = "userName", column = "user_name")
            ,@Result(property = "password", column = "password")
            ,@Result(property = "phone", column = "phone")})
    List<User> getAll();


    @Select("select * from t_user where user_id=#{id}")
    @Results({@Result(property = "userId", column = "user_id")
            ,@Result(property = "userName", column = "user_name")
            ,@Result(property = "password", column = "password")
            ,@Result(property = "phone", column = "phone")})
    User getUserById(long id);


    @Select("select * from t_user where user_name like #{name}")
    @Results({@Result(property = "userId", column = "user_id")
            ,@Result(property = "userName", column = "user_name")
            ,@Result(property = "password", column = "password")
            ,@Result(property = "phone", column = "phone")})
    List<User> getUserByName(String name);

}
