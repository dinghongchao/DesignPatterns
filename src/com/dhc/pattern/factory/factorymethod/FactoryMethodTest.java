package com.dhc.pattern.factory.factorymethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        ISmsFactory factory = new NoticeSmsFactory();
        factory.send();
    }


}
