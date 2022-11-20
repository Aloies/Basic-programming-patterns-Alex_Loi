package com.newHardSkill.Patterns.structural.composite;

public class Compasite {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer firstCppDeveloper = new CppDeveloper();
        Developer secondCppDeveloper = new CppDeveloper();

        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(firstCppDeveloper);
        team.addDeveloper(secondCppDeveloper);
        team.removeDeveloper(secondCppDeveloper);

        team.createProject();
    }
}
