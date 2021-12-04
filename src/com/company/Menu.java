package com.company;

public enum Menu {
    CHALLANGE1, CHALLANGE2, CHALLANGE3, EXIT, OPEN;

    Menu() {
        System.out.println("WELCOME");
    }
    public void Test(){
        System.out.println("AHHH");
    }

    public void brum(){
        System.out.println("BRUM BRUM");
    }

    public void sheep(){
        System.out.println("Mbeeek");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
