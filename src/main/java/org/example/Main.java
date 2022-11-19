package org.example;

public class Main {

        //Constants
        static int WAGE_PER_HOUR = 20;
        static int FULL_DAY_HOUR = 8;
        static int PART_TIME_HOUR = 4;
        static final int IS_FULL_TIME = 1;
        static final int IS_PART_TIME = 2;
        static int MAX_HRS_IN_MONTH = 100;
        static int NUM_OF_WORKING_DAYS = 20;

    public static void main(String[] args) {
        int empHrs = 0 , Total_Emp_Hours=0, Total_Emp_Wage=0, Total_Working_Days=0;
        while(Total_Emp_Hours <= MAX_HRS_IN_MONTH && Total_Working_Days < NUM_OF_WORKING_DAYS) {
            Total_Working_Days++;
            int attendance = (int) Math.floor(Math.random()*10)%3;
            switch (attendance) {
                case IS_FULL_TIME:
                    empHrs = FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    empHrs = PART_TIME_HOUR;
                    break;
                default:
                    empHrs = 0;
            }
            Total_Emp_Hours +=empHrs;
            System.out.println("Day#: " + Total_Working_Days + " Emp Hr: " +empHrs);
        }
         Total_Emp_Wage = Total_Emp_Wage * WAGE_PER_HOUR;;
        System.out.println("Total monthly wage is: " +Total_Emp_Wage);
    }
}
