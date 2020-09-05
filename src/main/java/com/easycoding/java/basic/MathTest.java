package com.easycoding.java.basic;

public class MathTest {
    public static void main(String[] args) {

        /**
         *Java 的 Math 包含了用于执行基本数学运算的属性和方法，如初等指数、对数、平方根和三角函数。
         * Math 的方法都被定义为 static 形式，通过 Math 类可以在主函数中直接调用
         *
         * Character 类在对象中包装一个基本类型 char 的值
         * **/

        int a = 5000;
        float b = 13.65f;
        byte c = 0x4a;

        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));
        System.out.println("0度的余弦值：" + Math.cos(0));
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));
        System.out.println("1的反正切值： " + Math.atan(1));
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);


        char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };
        Character character = new Character('a');
        System.out.println(character);
        System.out.println("访问\"菜鸟教程!\"");
    }
}
