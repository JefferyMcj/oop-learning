package com.easycoding.java.senior.serialization;

import com.easycoding.java.senior.User;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {
    /**
     * serialize:
     *        Java 提供了一种对象序列化的机制，该机制中，一个对象可以被表示为一个字节序列，该字节序列包括该对象的数据、有关对象的类型的信息和存储在对象中数据的类型
     *        序列化对象写入文件之后，可以从文件中读取出来，并且对它进行反序列化，也就是说，对象的类型信息、对象的数据，还有对象中的数据类型可以用来在内存中新建对象。
     *        Java 虚拟机（JVM）独立的，也就是说，在一个平台上序列化的对象可以在另一个完全不同的平台上反序列化该对象。类 ObjectInputStream 和 ObjectOutputStream 是高层次的数据流，它们包含反序列化和序列化对象的方法
     *
     *
     *        核心： 在一个平台上序列化的对象可以在另一个完全不同的平台上反序列化该对象
     *        类 ObjectInputStream 和 ObjectOutputStream 是高层次的数据流，它们包含反序列化和序列化对象的方法
     * 序列化的前提条件：
     *      1、该类必须实现 java.io.Serializable 接口
     *      2、该类的所有属性必须是可序列化的。如果有一个属性不是可序列化的，则该属性必须注明是短暂的
     * **/
    public static void main(String[] args) {

        User user = new User();
        user.age = 18;
        user.name = "小明";
        user.address = "江苏";
        user.height =  172;
        user.weight = 68;
//        try{
//            FileOutputStream fileOutputStream = new FileOutputStream("/tmp/employee.ser");
//            ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
//            out.writeObject(user);
//            out.close();
//            fileOutputStream.close();
//            System.out.printf("Serialized data is saved in /tmp/employee.ser");
//        }catch (IOException ioException){
//            ioException.printStackTrace();
//        }
    }
}
