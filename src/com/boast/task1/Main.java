/*
 * Main.java 22/07/2017
 *
 * Created by Bondarenko Oleh
 */


package com.boast.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int levels = in.nextInt();

        buildPyramid(levels);

    }

    private static void buildPyramid(int levels) {

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