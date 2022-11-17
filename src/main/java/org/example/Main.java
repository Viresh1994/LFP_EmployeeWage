package org.example;

public class Main {
    public static void main(String[] args) {
        int Wage_Per_Hour = 20;
        int Full_Day_Hour = 8;
        int Part_Time_Hour = 4;
        int is_Present = 1;
        int is_Part_Time_Present = 2;
        int Total_Wage;
        double attendance = Math.floor(Math.random()*3);
        if(is_Present==attendance) {
            System.out.println("Employee is present");
            Total_Wage = Wage_Per_Hour * Full_Day_Hour;
        }
        else if(is_Part_Time_Present==attendance){
            System.out.println("Employee is present time only");
            Total_Wage = Wage_Per_Hour * Part_Time_Hour;
        }
        else{
            System.out.println("Employee is not present");
            Total_Wage = Wage_Per_Hour * 0;
        }
        System.out.println("Total wage is: " +Total_Wage);
    }
}