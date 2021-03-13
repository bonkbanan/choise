package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        String[] names = new String[6];
        names [0] = "Артем";
        names [1] = "Олег";
        names [2] = "Девид";
        names [3] = "Саша";
        names [4] = "Максим 1";
        names [5] = "Максим 2";

        String[] figures = new String[10];
        figures [0] = "Ромб";
        figures [1] = "Паралелаграm";
        figures [2] = "Рівностороній Трикутник";
        figures [3] = "Пралепіпет";
        figures [4] = "Трапеція";
        figures [5] = "Круг";
        figures [6] = "Еліпс";
        figures [7] = "Циліндр";
        figures [8] = "Конус";
        figures [9] = "Піраміда";
        for (int i = 0; i < names.length; i++) {
            int j = random.nextInt(figures.length);
            /*if(i==0 || i==3){
                continue;
            }*/
            while(figures[j].equals("")){
                j=random.nextInt(figures.length);
            }
            System.out.println(names[i] + " " + figures[j]);
            figures[j]="";
        }
    }
}
