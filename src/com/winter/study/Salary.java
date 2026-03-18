package com.winter.study;

public class Salary {

    public void make(int salary, boolean isTaxed) {
        System.out.println("급여 계산 시작...");

        double result;

        if (isTaxed) {
            // 세금 계산 줄이 붙어 있던 부분을 각각 분리해서 계산이 보이게 고쳤다.
            double tax1 = salary * 0.03;
            double tax2 = salary * 0.02;
            double tax3 = salary * 0.01;
            double tax4 = salary * 0.01;
            result = salary - tax1 - tax2 - tax3 - tax4;
            System.out.println("세후 급여: " + result);
        } else {
            result = salary;
            System.out.println("세전 급여: " + result);
        }
    }

    public void test(int[] nums) {
        if (nums != null && nums.length > 0) {
            nums[0] = nums[0] + 5;
            System.out.println("test 메서드에서 수정된 값: " + nums[0]);
        }
    }
}
