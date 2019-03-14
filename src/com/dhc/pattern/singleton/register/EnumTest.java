package com.dhc.pattern.singleton.register;

public class EnumTest {

    public static void main(String[] args) {
        Person p = new Person();

        System.out.println(EnumSingleton.INSTANCE.getPerson().getName());
    }
}
