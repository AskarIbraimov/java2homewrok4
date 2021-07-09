package com.GeekTech;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int stroke = scanner.nextInt();

        int listASize = stroke;
        int listBSize = stroke;

        ArrayList<String> a = new ArrayList<>(stroke);
        System.out.println("введите данные для списка:");

        while (listASize > 0) {
            a.add(scanner.next());
            listASize--;
        }
        print(a);
        System.out.println("++++++++++++++++++++++++++++++");

        ArrayList<String> b = new ArrayList<>(stroke);
        System.out.println("введите данные для второго списка:");

        while (listBSize > 0) {
            b.add(scanner.next());
            listBSize--;
        }
        print(b);

        System.out.println("++++++++++++++++++++++++++++++");

        ArrayList<String> c = new ArrayList<>(stroke);
        Collections.sort(a);
        Collections.sort(b);
        Collections.reverse(b);

        int index = 0;
        while (a.size() + b.size() > c.size()) {
            c.add(a.get(index));
            c.add(b.get(index));
            index++;
        }
        print(c);
        System.out.println("++++++++++++++++++++++++++++++");

        c.sort(Comparator.comparing(String::length));
        print(c);
    }

    static void print(ArrayList list) {

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
/*
* 7)  (Дэдлайн 3 дня)
a)  В задании нельзя использовать циклы for и for each. Только while и Iterator
b)  Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
c)  Затем программа должна отобразить этот список
*
d)  Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б.
*  После также отображает его в консоли
*
e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
f)  После объединения отобразить в консоли список С
*
g)   В конце отсортировать элементы списка С по длине слова, сначала идут String-и с наименьшим количеством символов,
*  и распечатать отсортированный список С.*/