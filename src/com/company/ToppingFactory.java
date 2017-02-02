package com.company;

/**
 * Created by lushin on 02.02.2017.
 */
public class ToppingFactory {
    public Topping CreateTopping(int type) {
        Topping top = null;
        switch (type) {
            case 1:
                top = new Topping("Орехи", 100);
                break;
            case 2:
                top = new Topping("Шоколад", 50);
                break;
            case 3:
                top = new Topping("Фрукты", 70);
                break;
            case 4:
                top = new Topping("Сироп", 60);
                break;
        }
        return top;
    }
}
