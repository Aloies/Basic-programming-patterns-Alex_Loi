package com.newHardSkill.Patterns.structural.adapter;

public class AdapterJavaToDatabase extends JavaApplication implements DataBase{

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        ubdateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        removeObject();
    }
}
