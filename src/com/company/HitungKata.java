package com.company;

import java.util.Scanner;

public class HitungKata {
    static int hitungKata(String kata){
        int jmlKalimat = 0;
        // kata.length adalah jumlah kata yang di input oleh user
        for(int i = 0; i < kata.length(); i++){
            if((i > 0) && (kata.charAt(i) !=' ') && (kata.charAt(i - 1) == ' ') || ((kata.charAt(0) != ' ') && (i == 0))) {
                jmlKalimat++;
            }
        }
        System.out.println(kata.length());
        return jmlKalimat;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String kata = userInput.nextLine();
        System.out.println(hitungKata(kata));
    }
}