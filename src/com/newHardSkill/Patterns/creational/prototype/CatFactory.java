package com.newHardSkill.Patterns.creational.prototype;

public class CatFactory {
    Cat cat;

    public CatFactory(Cat cat) {
        this.cat = cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Cat copyFactory(){
        return (Cat) cat.copy();
    }
}
