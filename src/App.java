 import java.util.Random;
import java.util.Scanner;

public class App {
       public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int num1;
        int money;
        int times = 0;
        String answer;
        System.out.println("How much money would you like to spend?");
        money = in.nextLine();
        do {
            intiger.parseInt(money)--;
        for (int counter = 0; counter < 3; counter++)
        {
            num1 = random.nextInt(10) + 1;
            System.out.print(num1 + " ");
            if (num1 == 7)
            {
                times++;
            }
        }
        if (times == 1)
        {
            System.out.println("You won 3£");
            money = money + 3;
        }
        else if (times == 2)
        {
            System.out.println("You won 5£");
            money = money + 5;
        }
        else if (times == 3)
        {
            System.out.println("You won 10£");
            money = money + 10;
        }
        else System.out.println("You lost");
        times = 0;
        if (money == 0) 
        {
            System.out.println("You are out of money, better luck next time");
            break;
        }
        System.out.println("You have " + money + "£ left. Would you like to play again?");
        answer = in.nextLine();
        
    } while (answer.equals("yes"));
    System.out.println("Good for you, for quiting your gambling addiction!");
    }
}
