package com.smart.wen.bean;

import lombok.Data;

import java.util.List;
import java.util.Map;
@Data
public class User {
    private String name;
    private String password;
    private Address address;
    private List<Integer> list;
    private Map<String,String> map;

    //构造方法执行之后自动执行的初始化方法
    public void init(){
        this.name="初始化方法";
    }

    public void destory(){
        System.out.println("回收方法");
    }

}
