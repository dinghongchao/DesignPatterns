package com.dhc.pattern.singleton.register;

public enum EnumSingleton {
    INSTANCE;

    private Person person = new Person();

    public Person getPerson() {
        return person;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
