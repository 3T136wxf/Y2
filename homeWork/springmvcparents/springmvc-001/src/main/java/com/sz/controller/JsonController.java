package com.sz.controller;

import com.sz.dto.UserAndDog;
import com.sz.pojo.Dog;
import com.sz.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/json")
public class JsonController {

    @RequestMapping("/m1")
    @ResponseBody
    public String m1(){
        return "ha ha ha i'm success!!!";
    }

    @RequestMapping("/m2")
    @ResponseBody
    public User m2(){
        User u  =  new User();
        u.setAge(38);
        u.setUserName("郭靖");
        u.setUid(1);
        return u;
    }

    @RequestMapping("/m3")
    @ResponseBody
    public List<User> m3(){
        List<User> l = new ArrayList<>();
        User u  =  new User();
        u.setAge(38);
        u.setUserName("小龙女");
        u.setUid(2);
        l.add(u);
        User u2  =  new User();
        u2.setAge(25);
        u2.setUserName("杨过");
        u2.setUid(3);
        l.add(u2);
        return l;
    }

    @RequestMapping("/m4")
    @ResponseBody
    public User[]  m4(){
        List<User> l = new ArrayList<>();
        User u  =  new User();
        u.setAge(38);
        u.setUserName("刘德华");
        u.setUid(4);

        User u2  =  new User();
        u2.setAge(29);
        u2.setUserName("刘诗诗");
        u2.setUid(5);
        User[] users = {u,u2};
        return users;
    }

    @RequestMapping("/m5")
    @ResponseBody
    public Map<String,User> m5(){
        List<User> l = new ArrayList<>();
        User u  =  new User();
        u.setAge(38);
        u.setUserName("刘德华");
        u.setUid(6);

        User u2  =  new User();
        u2.setAge(29);
        u2.setUserName("刘诗诗");
        u2.setUid(7);

        Map<String,User> users = new HashMap<>();
        users.put("u1",u);
        users.put("u2",u2);

        return users;
    }

    @RequestMapping("/m6")
    @ResponseBody
    public List<Map<String,Object>> m6(){

        // 第一个键对应User
        // 第二个键对应Dog
        // "user"  "dog"
        List<Map<String,Object>> l = new ArrayList<>();

        Map<String,Object> map1 = new HashMap<>();
        Map<String,Object> map2 = new HashMap<>();
        Map<String,Object> map3 = new HashMap<>();
        User u = new User(8,50,"周润发");
        Dog d  = new Dog("金毛狮王","金色");

        User u2 = new User(9,12,"张学友");
        Dog d2  = new Dog("蓝毛狮王","蓝色");

        User u3 = new User(10,85,"郭富城");
        Dog d3  = new Dog("绿毛狮王","绿色");

        map1.put("user",u);
        map1.put("dog",d);

        map2.put("user",u2);
        map2.put("dog",d2);

        map3.put("user",u3);
        map3.put("dog",d3);
        l.add(map1);
        l.add(map2);
        l.add(map3);
        return l;

    }

    @RequestMapping("/m7")
    @ResponseBody
    public UserAndDog m7(){
        User u2 = new User(11,52,"周星驰");
        Dog d2  = new Dog("蓝毛狮王","蓝色");

        UserAndDog ud = new UserAndDog();
        ud.setDog(d2);
        ud.setUser(u2);

        return ud;
    }

    @RequestMapping("/all")
    @ResponseBody
    public List<User> all(){

        List<User> list  =new ArrayList<>();
        User user1 = new User(1,22,"张浩");
        User user2 = new User(2,23,"张好");
        User user3 = new User(3,24,"张号");
        User user4 = new User(4,25,"张豪");
        User user5 = new User(5,26,"张郝");
        User user6 = new User(6,27,"张皓");

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        list.add(user6);

        return  list;

    }

}
