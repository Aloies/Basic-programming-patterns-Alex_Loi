package com.newHardSkill.Patterns.creational.builder;

public class EnterpiseWebSiteBuilder extends WebSiteBuilder {
    @Override
    void buildName() {
        webSite.setName("Enerprise web site");
    }

    @Override
    void buildCms(){
        webSite.setSmc(Cms.ALFRESCO);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(10000);
    }
}
