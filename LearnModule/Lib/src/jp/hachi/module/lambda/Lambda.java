package jp.hachi.module.lambda;

import java.util.ArrayList;

public class Lambda {
    public void lambda() {
        var list = new ArrayList<>();
        list.add("Message");
        list.add(123);
        list.add('c');
        for(Object o : list) {
            System.out.println(o.getClass());
        }
    }
}
