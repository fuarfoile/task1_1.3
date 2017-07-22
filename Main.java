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

        for (int i = 1; i <= levels; i++) {

            String level = i + "";

            for (int j = i - 1; j > 0; j--) {
                level = j + level + j;
            }

            for (int j = i; j < levels; j++) {
                level = " " + level;
            }

            System.out.println(level);
        }
    }
}
