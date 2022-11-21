package com.newHardSkill.Patterns.behavioral.strategy;

public class Human {

    private String name;
    private Activity activity;

    public Human(String name) {
        this.name = name;
    }


    public void setActivity(Activity activity){
       this.activity = activity;
    }

    public void justDoIt(){
        activity.justDoIy();
    }
}
