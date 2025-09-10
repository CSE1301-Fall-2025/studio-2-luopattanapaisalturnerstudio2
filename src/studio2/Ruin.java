import java.util.Scanner;
public class Ruin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter starting amount:");
        double startAmount = in.nextDouble();
        System.out.println("Enter win chance:");
        double winChance = in.nextDouble();
        System.out.println("Enter your win limit:");
        double winLimit = in.nextDouble();
        System.out.println("Enter how many days you're visiting the casino");
        int totalSimulations = in.nextInt();
        int days = 0;
        double currentAmount = 0;
        while (days < totalSimulations) {
            currentAmount = startAmount;
            days ++;
            while ((currentAmount < winLimit) && (currentAmount >= 0)){
                double trueWinChance = Math.random();
                if  (trueWinChance <= winChance){
                    currentAmount ++;
                }
                else{
                    currentAmount --;
                }
            }
            if (currentAmount <= 0){
                System.out.println("YOU WENT BANKRUPT!");
            }
            else{
                System.out.println("YOU ESCAPED THE RAT RACE!");
            }
    }


    }
}
