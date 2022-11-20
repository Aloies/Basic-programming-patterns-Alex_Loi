package com.newHardSkill.Patterns.behavioral.state;

public class HumanDay {
    public static void main(String[] args) {
        Activity activit = new Sleeping();
        Human human = new Human();

        human.setActivity(activit);

        for (int i = 0; i < 10; i++) {
            human.justDoIt();
            human.changeActivity();
        }
    }
}
