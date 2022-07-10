// Check Employee is Present or Absent

package com.Bridgelabz.Day08_EmployeeWageComputationOOPs;

import java.util.Random;

public class EmployeeWageBuilderOOPs_UC1 {

    static int IS_FULL_TIME = 1;
    public static void empCheck() {
        Random random = new Random();
        int empCheck = random.nextInt(2);
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }

    public static void main(String[] args) {
        EmployeeWageBuilderOOPs_UC1.empCheck();
    }
}
