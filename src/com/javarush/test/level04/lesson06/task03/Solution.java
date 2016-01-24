package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        reader.close();

        int an = Integer.parseInt(a);
        int bn = Integer.parseInt(b);
        int cn = Integer.parseInt(c);

        //int m2;

        if (an < bn && bn < cn)
            System.out.println(cn + " " + bn + " " + an);
        else
            if (bn < an && an < cn)
                System.out.println(cn + " " + an + " " + bn);
            else
                if (cn < bn && bn < an)
                    System.out.println(an + " " + bn + " " + cn);
                else
                    if (cn < an && an < bn)
                        System.out.println(bn + " " + an + " " + cn);
                    else
                        if (an < cn && cn < bn)
                            System.out.println(bn + " " + cn + " " + an);
                        else
                        System.out.println(an + " " + cn + " " + bn);
    }
}
