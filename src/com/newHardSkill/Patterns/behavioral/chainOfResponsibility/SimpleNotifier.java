package com.newHardSkill.Patterns.behavioral.chainOfResponsibility;

public class SimpleNotifier extends Notifier{
    public SimpleNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifier using simple report: " + message);
    }
}
