package com.newHardSkill.Patterns.behavioral.memento;

import java.util.Date;

public class Project {
    private String versiom;
    private Date date;

    @Override
    public String toString() {
        return "======================================================================================================"+
                "\nProject:\n" +
                "Version " + versiom +
                ",\nDate: " + date +"\n"+
                "======================================================================================================";
    }

    public Save save (){
        return new Save(versiom);
    }

    public void load(Save save){
        versiom = save.getVersion();
        date = save.getDate();
    }

    public void setVersionAndDate(String version){
        this.versiom = version;
        this.date = new Date();
    }
}
