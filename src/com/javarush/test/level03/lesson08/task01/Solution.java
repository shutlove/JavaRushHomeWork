package com.javarush.test.level03.lesson08.task01;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sAge = reader.readLine();

        System.out.println(name + " захватит мир через " + sAge + " лет. Му-ха-ха!");
        reader.close();
    }
}
