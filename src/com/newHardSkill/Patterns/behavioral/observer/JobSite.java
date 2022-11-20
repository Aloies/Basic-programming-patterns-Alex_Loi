package com.newHardSkill.Patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class JobSite implements Observed {
    List<String> vacancies = new ArrayList<>();

    List<Observer> subscribes = new ArrayList<>();

    public void addVacancy(String vacancy) {
        this.vacancies.add(vacancy);
        notifyObserver();
    }

    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribes.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribes.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observers : subscribes) {
            observers.handleEvent(this.vacancies);
        }
    }
}
