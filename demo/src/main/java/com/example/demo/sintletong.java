package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public enum sintletong {
    //单例
    getInstance();
    List list;
    sintletong() {
        list=new ArrayList();
    }
    public List getList(){
        return list;
    }
}
