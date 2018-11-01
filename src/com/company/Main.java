package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19)); //true because in range
        System.out.println(hasTeen(23, 15, 42)); //true because in range
        System.out.println(hasTeen(22, 23, 34)); //false because out of range
    }

    public static boolean hasTeen(int a, int b, int c) {
        if(a >= 13 && a <=19){
            return true;
        }else if(b >= 13 && b <=19){
            return true;
        }else if(c >= 13 && c <=19){
            return true;
        }else {
            return false;
        }
    }
}

