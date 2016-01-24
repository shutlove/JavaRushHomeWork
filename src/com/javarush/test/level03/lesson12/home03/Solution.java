package com.javarush.test.level03.lesson12.home03;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: nac999
 * Date: 23.11.13
 * Time: 01:17
 * To change this template use File | Settings | File Templates.
 */
public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        reader.close();

        System.out.println("Я буду зарабатывать $" + n + " в час");



        //java.io.InputStream inputStream = System.in;
        //java.io.Reader inputStreamReader = new InputStreamReader(inputStream);
        //BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //String n = bufferedReader.readLine();



       /* String n = null;
        try {
            n = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
              */
        //System.out.println("Я буду зарабатывать $" + n + " в час");


    }
}
