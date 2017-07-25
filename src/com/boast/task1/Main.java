package com.boast.task1;

import java.util.Scanner;

/**
 * Created by Bondarenko Oleh on 22.07.2017.
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int levels = in.nextInt();

        buildPyramid(levels);

    }

    private static void buildPyramid(int levels) {

        for (int level = 1; level <= levels; level++) {

            String resultLevel = level + "";

            for (int number = level - 1; number > 0; number--) {
                resultLevel = number + resultLevel + number;
            }

            for (int i = level; i < levels; i++) {
                resultLevel = " " + resultLevel;
            }

            System.out.println(resultLevel);
        }
    }
}
