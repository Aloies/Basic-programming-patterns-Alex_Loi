package com.newHardSkill.Patterns.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        GitHub gitHub = new GitHub();

        System.out.println("Creating new project. Version 0.1 | Создаем новый проект. Версия 0.1");
        project.setVersionAndDate("Version 0.1");

        System.out.println(project);

        System.out.println("Savving current version to github | Сохраняем текущую версию на github");
        gitHub.setSave(project.save());

        System.out.println("Updating project to version 0.2 | Обновляем проект до версии 0.2");

        System.out.println("Writing poor code | Пишем плохой код");

        project.setVersionAndDate("Version 0.2");

        System.out.println(project);

        System.out.println("Something went wrong | Что-то пошло не так");

        System.out.println("Rolling back to Version 0.1 | Откатывем до версии 0.1");

        project.load(gitHub.getSave());

        System.out.println(project);

    }
}
