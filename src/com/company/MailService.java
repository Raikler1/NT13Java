package com.company;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Mailable<T>> {
    private Map<String, List<T>> result = new HashMap<String, List<T>>(){
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, new LinkedList<T>());
        }
    };

    @Override
    public void accept(Mailable<T> mailbl) {
        if (result.containsKey(mailbl.getTo())){
            List <T> value = result.get(mailbl.getTo());
            value.add(mailbl.getContent());
        } else {
        result.put(mailbl.getTo(), new ArrayList<T>(Arrays.asList(mailbl.getContent())));
        }
    }

    @Override
    public Consumer andThen(Consumer after) {
        return null;
    }
    public Map<String, List<T>> getMailBox() {
        return result;
        }
}
