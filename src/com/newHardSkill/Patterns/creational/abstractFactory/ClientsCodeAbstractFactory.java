package com.newHardSkill.Patterns.creational.abstractFactory;

import com.newHardSkill.Patterns.creational.abstractFactory.appleProduct.AppleProduct;
import com.newHardSkill.Patterns.creational.abstractFactory.samsungProduct.SamsungProduct;

public class ClientsCodeAbstractFactory {
    public static void main(String[] args) {
        DeviceFactory deviceFactory = deviceFactoryByGrouping("samsung");
        Phone phone = deviceFactory.takeNewPhone();
        HeadPhones headPhones = deviceFactory.takeNewHeadPhones();
        Watch watch = deviceFactory.takeNewWatch();
        phone.buyPhone();
        headPhones.buyHeadPhones();
        watch.buyWatch();
    }
    static DeviceFactory deviceFactoryByGrouping(String product){
        if (product.equalsIgnoreCase("Apple")){
            return new AppleProduct();
        } else if (product.equalsIgnoreCase("Samsung")) {
            return new SamsungProduct();
        }else {
            throw new RuntimeException("So sorry, there no such brand");
        }
    }
}
