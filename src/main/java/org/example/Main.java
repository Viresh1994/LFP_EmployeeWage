package org.example;

public class Main {
    public static void main(String[] args) {
        int Wage_Per_Hour = 20;
        int Full_Day_Hour = 8;
        int Part_Time_Hour = 4;
        int is_Present = 1;
        int is_Part_Time_Present = 2;
        int Total_Wage;
        int working_Day_Month = 20;
        int Total_Wage_Month=0;
        int attendance = (int) Math.floor(Math.random()*3);

        switch (attendance){
            case 1:
                System.out.println("Employee is present");
                Total_Wage = Wage_Per_Hour * Full_Day_Hour;
                Total_Wage_Month = Total_Wage * working_Day_Month;

                break;
            case 2:
                System.out.println("Employee is present time only");
                Total_Wage = Wage_Per_Hour * Part_Time_Hour;
                Total_Wage_Month = Total_Wage * working_Day_Month;
                break;
            default:
                System.out.println("Employee is not present");
                Total_Wage = Wage_Per_Hour * 0;
                break;
        }
        System.out.println("Total daily wage is: " +Total_Wage);
        System.out.println("Total monthly wage is: " +Total_Wage_Month);
    }
}
