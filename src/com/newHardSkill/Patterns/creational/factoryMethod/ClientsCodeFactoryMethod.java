package com.newHardSkill.Patterns.creational.factoryMethod;

public class ClientsCodeFactoryMethod {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDevelopeBySpecialty("CPP");
        Developer developer = developerFactory.CreateDeveloper();
        developer.writeCode();
    }
    static DeveloperFactory createDevelopeBySpecialty (String developer){
        if (developer.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        } else if (developer.equalsIgnoreCase("php")) {
            return new PHPDeveloperFactory();
        } else if (developer.equalsIgnoreCase("cpp")) {
            return new CPPDeveloperFactory();
        }else {
            throw new RuntimeException(developer + " is unknow specialty");
        }
    }
}
