package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String m1 = reader.readLine();
        String n1 = reader.readLine();
        reader.close();

        int i, j;
        int m = Integer.parseInt(m1);
        int n = Integer.parseInt(n1);

        for (i=1;i<=n;i++)
        {
            for (j=1;j<=m;j++)
                System.out.print(8);
        }

    }
}
