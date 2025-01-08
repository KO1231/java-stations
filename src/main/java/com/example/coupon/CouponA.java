package com.example.coupon;

import java.util.Arrays;

public class CouponA {
    public float calculate(int[] cartItems){
        return Arrays.stream(cartItems).sum();
    }
}
