package com.example.coupon;

import java.util.Arrays;

public class CouponB {
    public float calculate(int[] cartItems){
        int result = Arrays.stream(cartItems)
                        .map(price -> (int) (price * 0.9)) // 10% off
                        .sum();
        return result >= 5000 ? result : result + 800;
    }
}
