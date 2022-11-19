package com.newHardSkill.Patterns.creational.abstractFactory.samsungProduct;

import com.newHardSkill.Patterns.creational.abstractFactory.Watch;

public class SamsungGalaxyWatch implements Watch {
    @Override
    public void buyWatch() {
        System.out.println("Use purchased new Samsung galaxy watch");
    }
}
