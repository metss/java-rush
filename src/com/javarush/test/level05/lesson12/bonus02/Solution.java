package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++ ) {
            int a = Integer.parseInt(reader.readLine());
//            if(a < min) {
//                min = a;
//            }
            min = a < min ? a : min;
        }

        System.out.println("Minimum = " + min);
    }


}
