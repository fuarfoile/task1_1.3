/*
 * Main.java 22/07/2017
 *
 * Created by Bondarenko Oleh
 */


package com.boast.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            new Pyramid(in.nextByte()).build();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}

class Pyramid{
    private byte levels;

    Pyramid(byte levels){
        this.levels = levels;
    }

    public void build(){
        for (int level = 1; level <= levels; level++) {

            StringBuilder resultLevel = new StringBuilder().append(level);

            for (int number = level - 1; number > 0; number--) {
                resultLevel.insert(0, number).append(number);
            }

            for (int i = level; i < levels; i++) {
                resultLevel.insert(0, ' ');
            }

            System.out.println(resultLevel);
        }
    }
}