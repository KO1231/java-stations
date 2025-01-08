package com.example.coupon;

import java.util.Arrays;

public class CouponC {
    public float calculate(int[] cartItems){
        int result = Arrays.stream(cartItems)
                        .map(price -> price >= 2000 ? (int) (price * 0.8) : price) // 2000円以上に対して 20% off
                        .sum();
        return result >= 5000 ? result : result + 800;
    }
}
