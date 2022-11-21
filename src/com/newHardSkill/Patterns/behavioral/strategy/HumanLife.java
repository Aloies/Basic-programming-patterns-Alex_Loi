package com.newHardSkill.Patterns.behavioral.strategy;

public class HumanLife {
    public static void main(String[] args) {
        Human human =new Human("Alex");

        human.setActivity(new Trainning());
        human.justDoIt();

        human.setActivity(new Sleeping());
        human.justDoIt();

        human.setActivity(new Work());
        human.justDoIt();

        human.setActivity(new Trainning());
        human.justDoIt();

    }
}
