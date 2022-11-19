package com.newHardSkill.Patterns.creational.abstractFactory;


public interface DeviceFactory {

    HeadPhones takeNewHeadPhones();
    Phone takeNewPhone();
    Watch takeNewWatch();
}
