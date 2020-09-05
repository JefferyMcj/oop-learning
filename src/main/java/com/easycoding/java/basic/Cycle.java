package com.easycoding.java.basic;

public class Cycle {

    public static void main(String[] args) {
        /**
         * 循环语句
         *      while
         *      do-while
         *      for
         * **/
        int i =0;
        while (i< 10){
            i++;
            System.out.println("第" + i + "次 hello world");
        }

        int j =0;
        do {
            j++;
            System.out.println("第" + j + "次 hello world");
        }while (j<10);


        for (int k = 0; k <=10 ; k++) {

            for (int l = 0; l <5 ; l++) {
                if(l == 3){
                    break;
                }
//                System.out.println("第" + l + "次 hello");
            }
//            if(k == 8){
//                break; //break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。
//                //break 跳出最里层的循环，并且继续执行该循环下面的语句。
//            }
            System.out.println("第" + k + "次 for  hello world ");
        }


        int f =10;
        if(f < 10){
            System.out.println("小于10");
        }else if(f>10 && f<20){
            System.out.println("大于10  小于20");
        }else if(f>20 && f<30){
            System.out.println("大于20 小于30");
        }

        int g  =0;
        switch (g){  // switch 语句中的变量类型可以是： byte、short、int 或者 char  switch 支持字符串 String 类型
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("default");
                break;
        }

    }
}
