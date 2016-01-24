package com.javarush.test.level05.lesson12.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму. */

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i = 0;
        int sum = 0;

        do
        {   str = reader.readLine();

            if (str.equals("сумма"))
                System.out.println(sum);

            else
            i = Integer.parseInt(str);
            sum += i;
        }   while (!str.equals("сумма"));
    }
}
