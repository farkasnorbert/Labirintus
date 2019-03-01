package com.company;


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;






public class Main {

    private static int SIZE;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("N : ");
        SIZE = in.nextInt();
        System.out.print("Megoldasi modszer:");
        int m = in.nextInt();
        switch (m){
            case 1:backtracking();
                break;
            case 2:backtrackingMVRfc();
                break;
            case 3:backtrackingMVRAC3();
                break;
            default: break;
        }
    }

    private static void backtrackingMVRAC3() {
    }

    private static void backtrackingMVRfc() {
    }

    private static void backtracking() {

    }

}

