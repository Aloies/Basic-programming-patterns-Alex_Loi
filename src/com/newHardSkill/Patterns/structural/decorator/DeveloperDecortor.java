package com.newHardSkill.Patterns.structural.decorator;

public class DeveloperDecortor implements Developer{

    Developer developer;

    public DeveloperDecortor(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
