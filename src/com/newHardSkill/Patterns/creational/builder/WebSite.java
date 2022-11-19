package com.newHardSkill.Patterns.creational.builder;

public class WebSite {

    private String name;
    private Cms smc;
    private int price;

    @Override
    public String toString() {
        return "WebSite{" +
                "name='" + name + '\'' +
                ", smc=" + smc +
                ", price=" + price +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSmc(Cms smc) {
        this.smc = smc;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
