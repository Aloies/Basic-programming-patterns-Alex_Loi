package com.newHardSkill.Patterns.creational.abstractFactory.appleProduct;

import com.newHardSkill.Patterns.creational.abstractFactory.Phone;

public class ApplePhone implements Phone {
    @Override
    public void buyPhone() {
        System.out.println("Use purchased new IPhone 14pro");
    }
}
