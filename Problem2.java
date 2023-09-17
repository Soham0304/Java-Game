import java.util.Scanner;
import java.util.Random;
    public class Problem2 {
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            Random ran =new Random();
            System.out.println("Enter 0 for ROCk ,Enter 1 for PAPER, Enter 2 for SCISSOR:");
            int userInput=sc.nextInt();

            int computerInput=sc.nextInt(3);

            if (userInput==computerInput){
                System.out.println("Draw");
            }
            else if(userInput == 0 && computerInput==2 || userInput==1 && computerInput==0 ||
                    userInput==2 && computerInput==1){
                System.out.println("You Win");
            }
            else {
                System.out.println("Computer Win");
            }
            // computer input:
            if (computerInput==0){
                System.out.println("Computer choice : ROCK");
            } else if (computerInput==1) {
                System.out.println("Computer choice : PAPER");
            } else if (computerInput==2) {
                System.out.println("Computer choice : SCISSOR");
            }
        }
}
