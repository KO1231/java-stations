package com.example.station6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ここから
        int[] users = {23,36,31,48,58};

        int all = Arrays.stream(users).sum();
        System.out.println((double) all / 5);
        // ここまで
    }
}
