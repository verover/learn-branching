package com.company;

import java.util.Scanner;

public class HitungKata {
    static int hitungKata(String kata){
        int jmlKata =0;
        char jumlah[] = new char[kata.length()];
        for(int i = 0; i < kata.length(); i++){
            jumlah[i] = kata.charAt(i);
            if(((i > 0) && (jumlah[i] !=' ') && (jumlah[i - 1] == ' ') || ((jumlah[0] != ' ') && (i == 0))))
                jmlKata++;
        }
        return jmlKata;
    }
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String kata = userInput.nextLine();
        System.out.println(hitungKata(kata));
    }
}