package com.test;

import java.util.Arrays;

public class Human {
    private String name;
    private Language[] languages;

    public Human(String name, Language[] languages) {
        this.name = name;
        this.languages = languages;
    }

    public Human() {
    }

    public String speak(Language language){
        if (Arrays.asList(languages).contains(language)){
            return "My name is,"+name;
        }else{
            return "I don't know this language";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language[] getLanguages() {
        return languages;
    }

    public void setLanguages(Language[] languages) {
        this.languages = languages;
    }
}
