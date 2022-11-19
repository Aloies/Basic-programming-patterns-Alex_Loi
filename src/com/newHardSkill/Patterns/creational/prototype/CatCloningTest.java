package com.newHardSkill.Patterns.creational.prototype;

public class CatCloningTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 5 , 6);

        System.out.println(cat);

        System.out.println("\n====================================\n");

        CatFactory factory = new CatFactory(cat);
        Cat catClone = factory.copyFactory();

        System.out.println(catClone);
    }
}
