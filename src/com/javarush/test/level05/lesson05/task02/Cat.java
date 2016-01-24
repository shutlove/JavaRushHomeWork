package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat): реализовать механизм драки котов в зависимости от их веса,
возраста и силы. Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие: если cat1.fight(cat2) = true , то cat2.fight(cat1) = false */

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat()
    {
        Cat cat1 = new Cat();
        cat1.name = "Barsik";
        cat1.age = 2;
        cat1.weight = 5;
        cat1.strength = 10;

        Cat cat2 = new Cat();
        cat2.name = "Felix";
        cat2.age = 3;
        cat2.weight = 6;
        cat2.strength = 11;

    }

    public boolean fight(Cat Cat)
    {
        //напишите тут ваш код
        cat1.fight(cat2);


        if cat1.fight(cat2) = true
            do
        if cat2.fight(cat1) = false;
            do
    }
}