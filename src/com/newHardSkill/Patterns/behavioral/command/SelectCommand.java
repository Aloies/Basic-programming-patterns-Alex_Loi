package com.newHardSkill.Patterns.behavioral.command;



public class SelectCommand implements Command{
    Database dataBase;

    public SelectCommand(Database dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.select();
    }
}
