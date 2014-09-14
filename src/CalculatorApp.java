/**
 * Created by elyseturner on 9/14/14.
 */
//This calculator app will take user input, remember it, select a mathematical operator and display the answer
//after the answer is displayed, it will need to ask if the user would like to calculate anything else

//First, I imported a scanner so I could remember my users input. If the user wants to perform: +-* or /, the calculator will
//ask them to input 2 numbers
//
import java.util.*;
public class CalculatorApp {
    public static void main(String[] args) {
        System.out.println("Enter your selection: 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division and 5 for the square root:");
        Scanner inp3 = new Scanner(System.in);
        int choose;
        choose = inp3.nextInt();

//Once they choose what operation they want to perform, if its 1-4, they will be given the route that let's them compute 2 #'s
        if (choose <= 4 && choose > 0) {
            System.out.println("Hello! Please enter your first number:");
            Scanner inp1 = new Scanner(System.in);
            int num1;
            num1 = inp1.nextInt();
            int ans1;
            System.out.println("Enter second number:");
            Scanner inp2 = new Scanner(System.in);
            int num2;
            num2 = inp2.nextInt();
            int ans2;
            switch (choose) {
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    break;
                default:
                    System.out.println("Oh boy...Looks like that's not one of your options. ");
            }
//If they choose #5 square root they will only be able to enter one # and it will be computed
        } else if(choose == 5) {
            System.out.println("Please enter the number you would like the square root of :");
            Scanner inp1 = new Scanner(System.in);
            double num4;
            num4 = inp1.nextInt();
            double ans4;
            System.out.print(Math.sqrt(num4));
        } else{
            System.out.println("That is not a valid entry, please enter 1-5" );
        }
    }
}