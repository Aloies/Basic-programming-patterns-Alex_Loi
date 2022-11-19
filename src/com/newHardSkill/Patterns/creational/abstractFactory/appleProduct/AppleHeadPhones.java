package com.newHardSkill.Patterns.creational.abstractFactory.appleProduct;

import com.newHardSkill.Patterns.creational.abstractFactory.HeadPhones;

public class AppleHeadPhones implements HeadPhones {
    @Override
    public void buyHeadPhones() {
        System.out.println("Use purchased new Apple air pods pro");
    }
}
