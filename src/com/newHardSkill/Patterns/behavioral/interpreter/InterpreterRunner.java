package com.newHardSkill.Patterns.behavioral.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEDeveloper = getJavaEEExpression();

        System.out.println("Значет ли разрабочик Java Core " + isJava.interpreter("Java"));
        System.out.println("Значет ли разрабочик Java EE " + isJavaEEDeveloper.interpreter("Java Spring"));

    }
    public static Expression getJavaExpression(){
      Expression java = new TerminalExpression("Java");
      Expression javaCore = new TerminalExpression("Java Core");
      return new OrExpression(java,javaCore);
    }

    public static Expression getJavaEEExpression(){
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");
        return new AndExpression(java,spring);
    }
}
