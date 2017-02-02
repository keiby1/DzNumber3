package com.company;

import java.util.Random;

/**
 * Created by lushi on 12.11.2016.
 */
public class Surprise extends Ice {
    public Surprise(int capacity, int taste) {
        super(capacity, taste);
    } //мороженое Сюрприз

    @Override
    public void AddTopping() { //перегруженный метод добавления топпинга
        Random r = new Random();
        ToppingFactory toppingFactory = new ToppingFactory();
        int key = r.nextInt(4) + 1;
        top.add(toppingFactory.CreateTopping(key));
        key = r.nextInt(4) + 1;
        top.add(toppingFactory.CreateTopping(key));
    }
}
