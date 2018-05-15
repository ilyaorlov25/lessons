package com.company;

public class Main {

    public static void main(String[] args) {
        Plane plane = new Plane();  //создание самолета
        plane.setMaxHeight(800);    //установка макс. высоты
        plane.land();               //подготовка/приземление
        plane.fill(500);       //заправка
        plane.fly();                //взлёт
    }
}

class Plane {
    private double height=-1;   //переменная высоты
    private double fuel;        //топливо
    private int maxHeight;      //макс. высота
    public void setMaxHeight(int maxHeight) {   //установка макс. высоты
        this.maxHeight=maxHeight;
    }
    public void land() {     //процесс приземления/подготовки
        height=0;
    }
    public void fly() {     //вызов полёта
        if (height==0 && fuel>0) { //если готов
            while (height<maxHeight && fuel>0) {  //процесс полёта
                System.out.println("Летиииим");
                height+=100+Math.random()*100;    //увеличение высоты
                if (height>maxHeight) {     //при высоте выше максимальной присваеваем максимальную
                    height=maxHeight;
                }
                System.out.println("Высота: " + height);   //вывод высоты
                fuel-=50+Math.random()*50;  //уменьшение топлива
                if (fuel<0) {   //если кол-во топлива отрицательно, присваеваем 0
                    fuel=0;
                }
                System.out.println("Топливо: " + fuel);       //вывод топлива
                if (fuel==0) {                                //при растрате топлива
                    System.out.println("Кончилось топливо");
                    System.out.println("ПОТРАЧЕНО");
                    break;
                }
            }
        } else if (height!=0){                                    //если не приземлен
            System.out.println("Приземлите самолёт");
        } else if (fuel==0) {                                     //если не заправлен
            System.out.println("Заправьте самолёт");
        }
        if (height==maxHeight && fuel!=0) {                       //если макс. высота достигнута
            System.out.println("Достигнута максимальная высота");
            System.out.println("Идёт приземление");
            while (height>0) {                                  //процесс приземления, схож с пожъёмом
                System.out.println("Фьюююю");
                height-=200+Math.random()*120;
                if (height<0) {
                    height=0;
                }
                System.out.println("Высота: " + height);
                fuel-=20+Math.random()*30;
                if (fuel<0) {
                    fuel=0;
                }
                System.out.println("Топливо: " + fuel);
                if (fuel==0) {
                    System.out.println("Кончилось топливо");
                    System.out.println("ПОТРАЧЕНО");
                    break;
                }
            }
            if (height==0) {
                System.out.println("Полёт прошёл успешно. Вы приземлились"); //после успешного приземления
            }
        }
    }
    public void fill(double fuel) {     //заправка
        this.fuel+=fuel;
        if (this.fuel>1000) {
            this.fuel=1000;
        }
    }
}

class Pilot {
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

