package com.newHardSkill.Patterns.creational.builder;

public class VisitCardWebSitebuilder extends WebSiteBuilder{
    @Override
    void buildName() {
        webSite.setName("Visit CARD");
    }

    @Override
    void buildCms() {
        webSite.setSmc(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(500);
    }
}
