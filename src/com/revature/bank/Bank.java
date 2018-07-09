package com.revature.bank;

public class Bank {

    Person person;

    public Bank() {}

    public Bank(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson() {
        this.person = person;
    }
}
