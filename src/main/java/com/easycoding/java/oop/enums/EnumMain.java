package com.easycoding.java.oop.enums;

public class EnumMain {
    public static void main(String[] args) {

        System.out.println(ColorEnum.BLUE.getName());
        for (ColorEnum color : ColorEnum.values()) {
            System.out.println(color.getName());
        }

        ColorEnum color = ColorEnum.BLUE;
        switch (color) {
            case BLUE:
                System.out.println("蓝色");
                break;
            case READ:
                System.out.println("红色");
                break;
            case YELLOW:
                System.out.println("黄色");
                break;
            default:
                break;
        }
    }
}
