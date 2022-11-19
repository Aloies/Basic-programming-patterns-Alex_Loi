package com.newHardSkill.Patterns.creational.abstractFactory.samsungProduct;

import com.newHardSkill.Patterns.creational.abstractFactory.HeadPhones;

public class SamsungHeadPhones implements HeadPhones {
    @Override
    public void buyHeadPhones() {
        System.out.println("Use purchased new Samsung galaxy buds");
    }
}
