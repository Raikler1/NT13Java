package com.company;

public class Salary implements Mailable<Integer> {
    private String from;
    private String to;
    private int content;

    public Salary(String fromWho, String toWho, int howMuch) {
        this.from = fromWho;
        this.to = toWho;
        this.content = howMuch;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Integer getContent() {
        return content;
    }
}
