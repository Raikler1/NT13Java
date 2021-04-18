package com.company;

public class Salary {
    public String fromWho;
    public String toWho;
    public int howMuch;

    public Salary(String fromWho, String toWho, int howMuch) {
        this.fromWho = fromWho;
        this.toWho = toWho;
        this.howMuch = howMuch;
    }

    public String getFrom() {
        return fromWho;
    }

    public String getTo() {
        return toWho;
    }

    public int getHow() {
        return howMuch;
    }
}
