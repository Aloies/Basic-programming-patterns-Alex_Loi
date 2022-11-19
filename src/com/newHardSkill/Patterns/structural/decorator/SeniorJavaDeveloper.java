package com.newHardSkill.Patterns.structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecortor{

    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }
    public String makeCodeReview(){
        return "Make code review. ";
    }

    public String makeJob(){
       return super.makeJob() + makeCodeReview();
    }

}
