package com.javarush.test.level04.lesson16.home02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Среднее такое среднее.
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое. */

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        reader.close();

        int an = Integer.parseInt(a);
        int bn = Integer.parseInt(b);
        int cn = Integer.parseInt(c);

        int m2;

        if (an < bn && bn < cn)
            m2 = bn;
        else
            if (bn < an && an < cn)
            m2 = an;
            else
            m2 = cn;

        System.out.println(m2);
    }
}