package com.newHardSkill.Patterns.creational.abstractFactory.samsungProduct;

import com.newHardSkill.Patterns.creational.abstractFactory.DeviceFactory;
import com.newHardSkill.Patterns.creational.abstractFactory.HeadPhones;
import com.newHardSkill.Patterns.creational.abstractFactory.Phone;
import com.newHardSkill.Patterns.creational.abstractFactory.Watch;

public class SamsungProduct implements DeviceFactory {
    @Override
    public HeadPhones takeNewHeadPhones() {
        return new SamsungHeadPhones();
    }

    @Override
    public Phone takeNewPhone() {
        return new SamsungGalaxyPhone();
    }

    @Override
    public Watch takeNewWatch() {
        return new SamsungGalaxyWatch();
    }
}
