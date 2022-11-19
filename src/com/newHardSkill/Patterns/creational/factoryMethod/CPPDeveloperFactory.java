package com.newHardSkill.Patterns.creational.factoryMethod;

public class CPPDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer CreateDeveloper() {
        return new CPPDeveloper();
    }
}
