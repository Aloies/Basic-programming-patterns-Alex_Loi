package com.newHardSkill.Patterns.behavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String skills[] = {"Java","Spring","Docker","Hibernate","Maven","PostgreSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Alex_Loi",skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer: "+ javaDeveloper.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext()){
            System.out.print(iterator.getNext().toString()+" ");
        }
    }
}
