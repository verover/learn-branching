package com.company;

public enum Menu {
    CHALLANGE1, CHALLANGE2, CHALLANGE3, EXIT, OPEN;

    Menu() {
        System.out.println("WELCOME");
    }
    public void Test(){
        System.out.println("AHHH");
    }

    public String Uonga() {
        System.out.println("OONGA BOONGA");
        return "oonga boonga";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
