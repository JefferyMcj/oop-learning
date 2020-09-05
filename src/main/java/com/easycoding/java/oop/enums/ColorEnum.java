package com.easycoding.java.oop.enums;

public enum ColorEnum {

    READ("READ","红色"),
    YELLOW("YELLOW","黄色"),
    BLUE("BLUE","蓝色"),
    ;

    ColorEnum(String code,String name){
        this.code = code;
        this.name = name;
    }

    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
