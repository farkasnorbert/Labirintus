package com.company;


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;






public class Main {

    private static int lo=0;
    private static int tabla;
    private static int[][] ta;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Tabla merete: ");
        tabla = in.nextInt();
        int[][] t = new int[tabla][tabla];
        System.out.print("Megoldasi modszer:");
        int m = in.nextInt();
        switch (m){
            case 1:if(backtracking(t,0,0,0)){
                print(ta);
            }else{
                System.out.println("Nincs megoldas");
            }
                break;
            case 2:if(backtrackingMVRfc()){
                print(ta);
            }else{
                System.out.println("Nincs megoldas");
            }
                break;
            case 3:if(backtrackingMVRAC3()){
                print(ta);
            }else{
                System.out.println("Nincs megoldas");
            }
                break;
            default: break;
        }
    }

    private static boolean backtrackingMVRAC3() {
    }

    private static boolean backtrackingMVRfc() {
    }

    private static boolean backtracking(int[][] t,int l,int i, int j) {
        if(i<tabla && j<tabla){

        }else{
            if(lo<l){
                lo=l;
                ta=t;
            }
        }
    }

    private static boolean validate(int[][] t,int i,int j){
        if(j-3>=0 && i-1>=0 && t[i-1][j-3]==1){
            return false;
        }
        if(j-3>=0 && i+1<tabla && t[i+1][j-3]==1){
            return false;
        }
        if(j-1>=0 && i-2>=0 && t[i-2][j-1]==1){
            return false;
        }
        if(j+1<tabla && i-2>=0 && t[i-2][j+1]==1){
            return false;
        }
        if(j-1>=0 && i+2<tabla && t[i+2][j-1]==1){
            return false;
        }
        if(j+1<tabla && i+2<tabla && t[i+2][j+1]==1){
            return false;
        }
        if(j+3<tabla && i-1>=0 && t[i-1][j+3]==1){
            return false;
        }
        if(j+3<tabla && i+1<tabla && t[+1][j+3]==1){
            return false;
        }
        return true;
    }

    private static void print(int[][] t){
        for(int i = 0; i < tabla; i++){
            for (int j = 0; j < tabla; j++){
                System.out.print(t[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

