package com.test;

import static com.test.Language.ENGLISH;
import static com.test.Language.RUSSIAN;

public class HelloWorld {
    public static void main(String[] arguments){
        int x=Integer.MAX_VALUE;
        byte y=Byte.MAX_VALUE;
        long z=200;
        float i=2.1f;
        double m=2.2;
        boolean n=true;
        char j='A';
        String o="test";
        UserType usertype=UserType.ADMIN;
        System.out.println(arguments[0]);
        System.out.println(arguments[1]);
        Human geo=new Human("Geo",new Language[]{ENGLISH});
        Human ivan=new Human();
        ivan.setName("Ivan");
        ivan.setLanguages(new Language[]{ENGLISH,RUSSIAN});
        System.out.println(geo.speak(RUSSIAN));
        System.out.println(geo.speak(ENGLISH));
        System.out.println(ivan.speak(RUSSIAN));
        System.out.println(ivan.speak(ENGLISH));
        System.out.println("gittest");
    }
}
enum UserType {
    ADMIN,VAREN;
}
