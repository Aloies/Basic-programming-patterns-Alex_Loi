package com.newHardSkill.Patterns.creational.abstractFactory.samsungProduct;

import com.newHardSkill.Patterns.creational.abstractFactory.Phone;

public class SamsungGalaxyPhone implements Phone {
    @Override
    public void buyPhone() {
        System.out.println("Use purchased new Samsung Galaxy pro ultra S max 89");
    }
}
