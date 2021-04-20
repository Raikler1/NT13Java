package com.company;

public interface Mailable<T> {
    String getTo();
    String getFrom();
    T getContent();
}
