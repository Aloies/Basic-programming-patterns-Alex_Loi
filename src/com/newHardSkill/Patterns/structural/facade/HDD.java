package com.newHardSkill.Patterns.structural.facade;

public class HDD {

    public void copyFromDVDRom(DVDRom dvd) {
        if (dvd.hasData()) {
            System.out.println("Копирование данных с диска");
            for (int i = 0; i < 101; i+=5){
                System.out.println("Loading "+i+"%");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Завершено успешно");
        }else{
            System.out.println("Отсутсвует диск в DVDRom");
        }
    }
}
