package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void show() {  //меню магазина мороженого
        System.out.println("1-Обычное");
        System.out.println("2-Сюрприз");
        System.out.println("3-Экстра");
        System.out.println("0-Выход");
    }

    public static void normal() {//покупка обычного мороженного
        Scanner sc = new Scanner(System.in);
        System.out.print("0-стаканчик\n1-рожок\nВыберите тип емкости: ");
        int emk = sc.nextInt();
        System.out.print("1-Шоколадное, 2-Клубничное, 3-Банановое, 4-Вишневое\nВыберите вкус: ");
        int vkus = sc.nextInt();

        Ice iIce = new Ice(emk, vkus);  //создание обычного мороженого
        System.out.println("Нужен ли топпинг? 0 - да, 1 - нет");
        int k = sc.nextInt();
        if (k == 0) {
            iIce.AddTopping();      //добавление топпинга, если нужно
        }
        iIce.printBasePrice();      //вывод базовой цены
        iIce.printCapacity();        //вывод ёмкости
        iIce.printTaste();       //вывод вкуса
        iIce.printTopping();        //вывод топпинга
        iIce.printSummaryPrice();   //вывод итоговой цены

    }

    public static void surp() {  //покупка мороженого сюрприз
        Random r = new Random();
        int emk = r.nextInt(1) + 1;
        int vkus = r.nextInt(4) + 1;

        Surprise sp = new Surprise(emk, vkus); //создание мороженого Сюрприз
        sp.AddTopping();                          //добавление топпинга
        sp.printBasePrice();                      //вывод начальной цены
        sp.printCapacity();                        //вывод ёмкости
        sp.printTaste();                       //вывод вкуса
        sp.printTopping();                        //вывод топпинга
        sp.printSummaryPrice();                   //вывод итоговой цены
    }

    public static void extr() {  //покупка мороженого Экстра
        Scanner sc = new Scanner(System.in);
        System.out.print("0-стаканчик\n1-рожок\nВыберите тип емкости: ");
        int emk = sc.nextInt();
        System.out.print("1-Шоколадное, 2-Клубничное, 3-Банановое, 4-Вишневое\nВыберите вкус: ");
        int vkus = sc.nextInt();

        Extra ex = new Extra(emk, vkus);    //создание мороженого
        ex.printBasePrice();                    //вывод начальной цены
        ex.printCapacity();                      //вывод емкости
        ex.printTaste();                     //вывод вкуса
        ex.printDrink();                    //вывод напитка
        ex.printSummaryPrice();                 //вывод итоговой цены
    }

    public static void main(String[] args) { //главный класс
        Scanner sc = new Scanner(System.in);
        int key;
        boolean flag = true;

        while (flag) {
            show(); //"меню магазина мороженого"
            key = sc.nextInt();
            switch (key) {
                case 0: {    //выход из приложения
                    flag = false;
                    break;
                }
                case 1: {   //обычное мороженое
                    normal();
                    break;
                }
                case 2:     //мороженое сюрприз
                {
                    surp();
                    break;
                }
                case 3: {    //мороженое Экстра
                    extr();
                    break;
                }
            }
        }
    }
}
