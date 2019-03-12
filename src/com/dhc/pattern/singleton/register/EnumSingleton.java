package com.dhc.pattern.singleton.register;

public enum EnumSingleton {
    INSTANCE;

    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
