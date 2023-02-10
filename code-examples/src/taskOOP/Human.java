package taskOOP;

import javax.sound.midi.Soundbank;

public class Human extends Animal {
    public String name;
    int age;

    @Override
    public void eat(){
        System.out.println("Человек спит");

    }
    @Override
    public void sleep(){
        System.out.println("Человек ест");

    }
}
