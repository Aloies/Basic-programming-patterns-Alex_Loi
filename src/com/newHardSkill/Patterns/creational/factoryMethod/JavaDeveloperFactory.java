package com.newHardSkill.Patterns.creational.factoryMethod;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer CreateDeveloper() {
        return new JavaDeveloper();
    }
}
