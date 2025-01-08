package com.example.station9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] itemPrices1 = {1000, 1100, 1200, 1300};
        int[] itemPrices2 = {1000, 1100, 1200, 1300, 1600, 1800};
        int[] itemPrices3 = {1000, 2100, 3200, 2300};
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円。期待されるクーポン: A。結果: ");
        test(itemPrices1);
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円, 1600円, 1800円。期待されるクーポン: B。結果: ");
        test(itemPrices2);
        System.out.print("カート内: 1000円, 2100円, 3200円, 2300円。期待されるクーポン: C。結果: ");
        test(itemPrices3);
    }

    public static void test(int[] itemPrices) {
        // ここから

        int resultA = Arrays.stream(itemPrices).sum();
        // 送料無料

        int resultB = Arrays.stream(itemPrices)
                        .map(price -> (int) (price * 0.9)) // 10% off
                        .sum();
        resultB += resultB >= 5000 ? 0 : 800; // 送料

        int resultC = Arrays.stream(itemPrices)
                        .map(price -> price >= 2000 ? (int) (price * 0.8) : price) // 2000円以上に対して 20% off
                        .sum();
        resultC += resultC >= 5000 ? 0 : 800; // 送料

        if(resultA < resultB && resultA < resultC) {
            System.out.println("A");
        } else if(resultB < resultA && resultB < resultC) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
        
        // ここまで
    }
}
