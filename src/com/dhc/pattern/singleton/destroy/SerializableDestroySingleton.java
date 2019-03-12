package com.dhc.pattern.singleton.destroy;

import com.dhc.pattern.singleton.create.LazySingleton;

import java.io.*;

public class SerializableDestroySingleton {

    public static void main(String[] args) {

        try {
            LazySingleton singleton = LazySingleton.getInstance();
            FileOutputStream fileOutputStream = new FileOutputStream("single.tmp");
            OutputStream ops = new ObjectOutputStream(fileOutputStream);
            ((ObjectOutputStream) ops).writeObject(singleton);

            File file = new File("single.tmp");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            LazySingleton s1 = (LazySingleton) ois.readObject();
            System.out.println(s1);
            FileInputStream fis2 = new FileInputStream(file);
            ObjectInputStream ois2 = new ObjectInputStream(fis2);
            LazySingleton s2 = (LazySingleton) ois2.readObject();
            System.out.println(s2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
