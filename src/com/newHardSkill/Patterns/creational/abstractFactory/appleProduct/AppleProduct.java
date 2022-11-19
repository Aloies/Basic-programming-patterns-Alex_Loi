package com.newHardSkill.Patterns.creational.abstractFactory.appleProduct;

import com.newHardSkill.Patterns.creational.abstractFactory.DeviceFactory;
import com.newHardSkill.Patterns.creational.abstractFactory.HeadPhones;
import com.newHardSkill.Patterns.creational.abstractFactory.Phone;
import com.newHardSkill.Patterns.creational.abstractFactory.Watch;

public class AppleProduct implements DeviceFactory {
    @Override
    public HeadPhones takeNewHeadPhones() {
        return new AppleHeadPhones();
    }

    @Override
    public Phone takeNewPhone() {
        return new ApplePhone();
    }

    @Override
    public Watch takeNewWatch() {
        return new AppleWatch();
    }
}
