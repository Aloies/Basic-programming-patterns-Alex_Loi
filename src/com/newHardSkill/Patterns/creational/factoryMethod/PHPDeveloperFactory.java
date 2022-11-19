package com.newHardSkill.Patterns.creational.factoryMethod;

public class PHPDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer CreateDeveloper() {
        return new PHPDeveloper();
    }
}
