package com.newHardSkill.Patterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JobSite jobSite = new JobSite();

        jobSite.addVacancy("Junior Java position");
        jobSite.addVacancy("Middle+ Java position");
        jobSite.addVacancy("Senior Java position");

        Observer firstSubscriber = new Subscriber("Alex_Loi");
        Observer secondSubscriber = new Subscriber("Alex_Frost");
        Observer thirdSubscriber = new Subscriber("Rita_Loi");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);
        jobSite.addObserver(thirdSubscriber);

        jobSite.notifyObserver();

        jobSite.addVacancy("TeamLid Java Position");
    }
}
