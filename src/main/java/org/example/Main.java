package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee!");
        int is_Present = 1;
        double attendance = Math.floor(Math.random()*10)%2;
        if(is_Present==attendance) {
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is not present");
        }
    }
}