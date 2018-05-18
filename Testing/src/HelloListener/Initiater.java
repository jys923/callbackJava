package HelloListener;

import java.util.*;

interface HelloListener {
    void someoneSaidHello();
}

public class Initiater {
    private List<HelloListener> listeners = new ArrayList<HelloListener>();

    public void addListener(HelloListener toAdd) {
        listeners.add(toAdd);
    }

    public void sayHello() {
        System.out.println("Hello!!");

        for (HelloListener hl : listeners)
            hl.someoneSaidHello();
    }
}