import java.util.InputMismatchException;
import java.util.Scanner;
public class Game
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = (int)(Math.random()
        *100);
        System.out.println("WELCOME TO NUMBER GAME:");
        int userchoice;
    while(true){
        System.out.println("Enter your number:");
        try{
        userchoice=sc.nextInt();
        if(userchoice==number){
            System.out.println("Congratulations! you guess it right");
             break;
        }
            else if(userchoice>number){
                System.out.println("number is too large");
            }
            else{
                System.out.println("number is too small");
            }
        } catch(InputMismatchException e){
            System.out.println("Invalid input: please write valid input");
            sc.next();
        }
        }
    }
    }