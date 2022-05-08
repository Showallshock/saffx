package com.example.mybatis;


import com.example.mybatis.dao.AnnotationUserMapper;
import com.example.mybatis.dao.BlogMapper;
import com.example.mybatis.dao.UserMapper;
import com.example.mybatis.pojo.Blog;
import com.example.mybatis.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void mybatisTest() {
        List<User> userList = userMapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    void mybatisTest2() {
        User user = userMapper.getUserById(1);
        System.out.println(user);
    }

    @Test
    void mybatisTest3() {
        int res = userMapper.addUser(new User(4, "赵六", "123333"));
        if (res > 0) {
            System.out.println("插入成功！");
        }
    }

    @Test
    void mybatisTest3_2() {
        HashMap map = new HashMap();
        map.put("id", 4);
        map.put("name", "小明");

        int res = userMapper.addUser2(map);
        if (res > 0) {
            System.out.println("插入成功！");
        }
    }

    @Test
    void mybatisTest4() {
        int res = userMapper.updateUser(new User(4, "AAA", "123123"));
    }

    @Test
    void mybatisTest5() {
        userMapper.deleteUser(4);
    }

    @Autowired
    AnnotationUserMapper annotationUserMapper;

    @Test
    void mybatisTest6() {
        List<User> userList = annotationUserMapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Autowired
    BlogMapper blogMapper;

    @Test
    void mybatisTest7() {
        HashMap map = new HashMap();
        map.put("title", "java学习");
        map.put("author", "小明");

        List<Blog> blogs = blogMapper.queryBlogIF(map);
        blogs.forEach(System.out::println);
    }

    @Test
    void mybatisTest8() {
        ArrayList<Integer> ids = new ArrayList<>();
        ids.add(2);
        ids.add(3);

        HashMap map = new HashMap();
        map.put("ids", ids);
        List<Blog> blogs = blogMapper.queryBlogForeach(map);
        blogs.forEach(System.out::println);
    }
}
