package ru.geekbrains.lesion1;

public class Teammates {
    String name;
    int stamina;

    public Teammates(String name, int stamina){
        this.name = name;
        this.stamina = stamina;
    }

    public void TeamInfo(){
        System.out.println(name + " " + stamina);
    }

    public String getName(){
        return  name;
    }

    public int getStamina(){
        return stamina;
    }
}
