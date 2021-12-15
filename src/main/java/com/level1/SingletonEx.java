package com.level1;

public class SingletonEx {


    private static SingletonEx singletonEx = new SingletonEx();

    private SingletonEx(){

    }

    public static SingletonEx getInstance(){
        return singletonEx;
    }

}
