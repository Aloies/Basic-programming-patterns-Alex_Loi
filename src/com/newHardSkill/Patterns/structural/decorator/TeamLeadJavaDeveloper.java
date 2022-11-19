package com.newHardSkill.Patterns.structural.decorator;

public class TeamLeadJavaDeveloper extends DeveloperDecortor {

    public TeamLeadJavaDeveloper(Developer developer) {
        super(developer);
    }
    public String sendWeerReport(){
        return "Send weer report to customer. ";
    }

    public String makeJob(){
        return super.makeJob()+sendWeerReport();
    }
}
