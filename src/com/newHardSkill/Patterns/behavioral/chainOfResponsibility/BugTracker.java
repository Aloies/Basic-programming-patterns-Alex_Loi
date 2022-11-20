package com.newHardSkill.Patterns.behavioral.chainOfResponsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTNAT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is ok.",Priority.ROUTINE);
        reportNotifier.notifyManager("Something went wrong!",Priority.IMPORTNAT);
        reportNotifier.notifyManager("Program crashed!!!",Priority.ASAP);
    }
}
