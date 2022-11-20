package com.newHardSkill.Patterns.behavioral.iterator;

import java.util.Arrays;

public class JavaDeveloper implements Collection{
    private String name;
    private String[] skills;

    public String getName() {
        return name;
    }

    public JavaDeveloper(String name, String[] skills) {
        this.name = name;
        this.skills = skills;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillsItreator();
    }

    private class SkillsItreator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            if (index< skills.length){
            return true;
            }else {
                return false;
            }
        }

        @Override
        public Object getNext() {
            return skills[index++];
        }
    }
}
