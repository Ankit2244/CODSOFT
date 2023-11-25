import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int randNum = random.nextInt(100)+1;

        Scanner scanner = new Scanner(System.in);

        int tryCount = 0;
        while (true){

            System.out.println("Enter your guess (Between 1 to 100) in next Line:");
            int guess = scanner.nextInt();
            tryCount++;
            System.out.println("This is Your try-> "+tryCount);
            if(tryCount==5){
                System.out.println("You have reached the maximum number of tries");
                System.out.println("The random number was "+randNum);
                break;
            }



            if (guess==randNum){
                System.out.println("You guessed the correct number , You win!!!!");
                if(tryCount==1){
                    System.out.println("You guessed the number in 1 try!! Score: 100");
                }
                else if (tryCount==2){
                    System.out.println("You guessed the number in 2 tries!! Score: 80");
                }
                else if (tryCount==3){
                    System.out.println("You guessed the number in 3 tries!! Score: 60");
                }
                else if (tryCount==4){
                    System.out.println("You guessed the number in 4 tries!! Score: 40");
                }
                else if (tryCount==5){
                    System.out.println("You guessed the number in 5 tries!! Score: 20");
                }
                else {
                    System.out.println("You guessed the number in "+tryCount+" tries!! Score: 0");
                }
                break;
            }
            else if (guess>randNum){
                System.out.println("Your guess is greater than the random number");
            }
            else if (guess<randNum){
                System.out.println("Your guess is less than the random number");
            }
            else {
                System.out.println("Invalid input");
            }




        }



    }

}
