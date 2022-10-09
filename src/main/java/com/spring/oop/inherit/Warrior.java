package com.spring.oop.inherit;

public class Warrior extends Player {

    private int rage;

    public Warrior(String nickName) {
        super(nickName);
        System.out.println("워리어생성자");
    }

}