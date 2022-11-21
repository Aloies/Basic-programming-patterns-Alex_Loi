package com.newHardSkill.Patterns.behavioral.template;

public abstract class WebsiteTemplate {
    public void showPage(){
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    abstract void showPageContent();
}
