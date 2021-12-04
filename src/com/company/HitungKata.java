package com.company;

public class HitungKata {
    static int hitungKata(String kata){
        int jml=0;
        char jumlah[] = new char[kata.length()];
        for(int i = 0; i < kata.length(); i++){
            jumlah[i] = kata.charAt(i);
            if(((i > 0) && (jumlah[i] !=' ') && (jumlah[i - 1] == ' ') || ((jumlah[0] != ' ') && (i == 0))))
                jml++;
        }
        return jml;
    }
    public static void main(String[] args) {
        String string = "satu dua tiga";
        System.out.println(hitungKata(string));
    }
}