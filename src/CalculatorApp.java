package com.example.CalculatorApp;

/**
 * Created by elyseturner on 9/14/14.
 */
//This calculator app will take user input, remember it, select a mathematical operator and display the answer
//after the answer is displayed, it will need to ask if the user would like to calculate anything else

//First, I imported a scanner so I could remember my users input. I ask the user for their first number, int num1,
//and then their second, int num2.
//
import java.util.*;
public class CalculatorApp{
    public static void main(String[] args)
    {
        System.out.println("Hello! Please enter your first number:");
        Scanner inp1= new Scanner(System.in);
        int num1;
        num1 = inp1.nextInt();
        int ans1;
        System.out.println("Enter second number:");
        Scanner inp2= new Scanner(System.in);
        int num2;
        num2 = inp2.nextInt();
        int ans2;
        System.out.println("Enter your selection: 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division and 5 for the square root:");
        int choose;

        }
        }