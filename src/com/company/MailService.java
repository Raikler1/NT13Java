package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Object> {
    private List<MailMessage> messages = new ArrayList<>();
    private List<Salary> salary = new ArrayList<>();


    @Override
    public void accept(Object o) {
        if(o instanceof MailMessage){
            messages.add((MailMessage) o);
        }
        if(o instanceof Salary){
            salary.add((Salary) o);
        }
    }

    @Override
    public Consumer andThen(Consumer after) {
        return null;
    }
    public Map<String, List<T>> getMailBox() {
        Map<String, List<T>> result = new HashMap<>();
        return result;
        }
}
