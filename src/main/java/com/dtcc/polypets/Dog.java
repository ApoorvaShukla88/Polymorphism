package com.dtcc.polypets;

public class Dog extends Pet{

    public Dog(String name, String speak){
        super(name);

    }
    public Dog(String nameOfPet) {
        super();
    }

//    public Dog(String name, String speak) {
//        super(name, speak);
//    }

    public String getSpeak(){
    String speak = "ROOF ROOF";
        return speak;
    }
}