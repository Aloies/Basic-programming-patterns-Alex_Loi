package com.newHardSkill.Patterns.creational.prototype;

public class Cat implements Copyable {
    private String name;
    private int age;
    private int weght;

    public Cat(String name, int age, int weght) {
        this.name = name;
        this.age = age;
        this.weght = weght;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weght=" + weght +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeght() {
        return weght;
    }

    public void setWeght(int weght) {
        this.weght = weght;
    }

    @Override
    public Object copy() {
        Cat cat = new Cat(name, age, weght);
        return cat;
    }
}
