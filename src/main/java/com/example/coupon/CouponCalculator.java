package com.example.coupon;

public class CouponCalculator {
    public String findBestCoupon(int[] cartItems){
        CouponA couponA = new CouponA();
        CouponB couponB = new CouponB();
        CouponC couponC = new CouponC();
        
        float 
            resultA = couponA.calculate(cartItems),
            resultB = couponB.calculate(cartItems),
            resultC = couponC.calculate(cartItems);
            
        if(resultA < resultB && resultA < resultC) {
            return "A";
        } else if(resultB < resultA && resultB < resultC) {
            return "B";
        } else {
            return "C";
        }
    }
}
