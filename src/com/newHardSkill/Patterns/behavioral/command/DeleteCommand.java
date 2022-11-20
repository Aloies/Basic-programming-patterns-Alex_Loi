package com.newHardSkill.Patterns.behavioral.command;


public class DeleteCommand implements Command {
    Database dataBase;

    public DeleteCommand(Database dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        dataBase.delete();
    }
}
