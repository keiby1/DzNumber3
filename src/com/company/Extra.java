package com.company;

import java.util.Scanner;

/**
 * Created by lushi on 12.11.2016.
 */
public class Extra extends Ice {//класс мороженого Экстра
    int Drink; //напиток

    public Extra(int capacity, int taste) { //конструктор класса
        super(capacity, taste); //вызов конструктора родительского класса
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите напиток: 1-Coca-Cola, 2-Pepsi, 3-Fanta, 4-Sprite:");
        Drink = sc.nextInt();
        switch (Drink) {
            case 1:
                SummaryPrice += 100;
                break;
            case 2:
                SummaryPrice += 70;
                break;
            case 3:
                SummaryPrice += 50;
                break;
            case 4:
                SummaryPrice += 80;
                break;
        }
    }

    public void printDrink() { //вывод напитка на экран
        switch (Drink) {
            case 1:
                System.out.println("Coca-Cola - 100");
                break;
            case 2:
                System.out.println("Pepsi - 70");
                break;
            case 3:
                System.out.println("Fanta - 50");
                break;
            case 4:
                System.out.println("Sprite - 80");
                break;
        }
    }
}
