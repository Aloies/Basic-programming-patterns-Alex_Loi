package com.newHardSkill.Patterns.creational.singleton;

public class ProgramLogger {
    private ProgramLogger() {

    }
    private static ProgramLogger programLogger;
    private static String logFile = "This is log file. \n\n";

    public static ProgramLogger getProgramLogger(){
        if(programLogger==null){
            programLogger = new ProgramLogger();
            return programLogger;
        }
        return programLogger;
    }

    public void addLogInfo(String info){
        logFile+= info+"\n";
    }
    public void showLogFile(){
        System.out.println(logFile);
    }

}
