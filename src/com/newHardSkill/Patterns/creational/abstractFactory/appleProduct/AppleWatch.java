package com.newHardSkill.Patterns.creational.abstractFactory.appleProduct;

import com.newHardSkill.Patterns.creational.abstractFactory.Watch;

public class AppleWatch implements Watch {
    @Override
    public void buyWatch() {
        System.out.println("Use purchased new Apple watch");
    }
}
