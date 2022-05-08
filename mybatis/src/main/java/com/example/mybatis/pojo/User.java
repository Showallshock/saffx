package com.example.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.apache.ibatis.type.Alias;


@Data
@AllArgsConstructor
@Alias("User")
public class User {
    private int id;
    private String name;
    private String pwd;
}