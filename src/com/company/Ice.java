package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lushi on 12.11.2016.
 */
public class Ice {  //класс обычного мороженого
    public int Capacity; //емкость 0-стаканчик 1 - рожок
    public int Taste;//вкус 1 из 4х
    public ArrayList<Topping> top;
    public int BasePrice, SummaryPrice; //базовая и итоговая цены

    public Ice(int capacity, int taste) { //конструктор класса
        Capacity = capacity;
        Taste = taste;
        top = new ArrayList<Topping>();

        if (Capacity == 0) {
            BasePrice = 70;
        } else
            BasePrice = 100;

        switch (Taste) {
            case 1:
                SummaryPrice = BasePrice + 50;
                break;
            case 2:
                SummaryPrice = BasePrice + 70;
                break;
            case 3:
                SummaryPrice = BasePrice + 80;
                break;
            case 4:
                SummaryPrice = BasePrice + 60;
                break;
        }
    }

    public void AddTopping() {   //метод дял добавления топпинга
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите топпинг: 1-орехи, 2-шоколад, 3-фрукты, 4-сироп");
        int key = sc.nextInt();
        ToppingFactory toppingFactory = new ToppingFactory();
        top.add(toppingFactory.CreateTopping(key));
    }

    public void printCapacity() {//вывод на экран емкости
        if (Capacity == 0)
            System.out.println("Ёмкость: стаканчик");
        else
            System.out.println("Ёмкость: рожок");
    }

    public void printSummaryPrice() {    //вывод на экран итоговой цены
        for (Topping topping : top)
            SummaryPrice += topping.getPrice();
        System.out.println("Итоговая цена: " + SummaryPrice + "\n");
    }

    public void printBasePrice() {//вывод на экран базовой цены
        System.out.println("Базовая цена: " + BasePrice);
    }

    public void printTaste() { //вывод на экран вкуса
        switch (Taste) {
            case 1:
                System.out.println("Шоколадный вкус " + 50);
                break;
            case 2:
                System.out.println("Клубничный вкус " + 70);
                break;
            case 3:
                System.out.println("Банановый вкус " + 80);
                break;
            case 4:
                System.out.println("Вишневый вкус " + 60);
                break;
        }
    }

    public void printTopping() { //вывод на экран топпинга
        for (Topping topping : top) {
            System.out.println(topping.getName() + " " + topping.getPrice());
        }
    }
}
