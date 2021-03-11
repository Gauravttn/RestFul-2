package com.bootcamp.demo.welcome;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users=new ArrayList<>();

    static {
        users.add(new User(1,"Gaurav","abcd"));
        users.add(new User(2,"Rahul","qwerty"));
        users.add(new User(3,"Megha","asdf"));
            }
    public List<User> findAll(){
        return users;
            }



}

