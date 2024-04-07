import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);

    int chances=5;
    int finals=0;

    boolean play_again=true;
    System.out.println("Welcome To The Game!");
    System.out.println("Hey Mate,you have "+chances+" chances to win the game");

    while(play_again)
    {
        int random=getRandonNumber(1,100);
        boolean guess=false;

        for (int i = 0; i < chances; i++) {
            System.out.println("Chance "+(i+1)+" :Enter your guess: ");
            int userguess=sc.nextInt();
            if(userguess==random)
            {
                guess=true;
                finals++;
                System.out.println("You won it.");
                break;
            }
            else if(userguess>random)
            {
                System.out.println("Your Guess is Too High");
            }
            else
            {
                System.out.println("Your Guess is Too Low");
            }
        }
    
        if(!guess)
        {
            System.out.println("Sorry Mate,you lost the chances.The number is "+random+".");
        }
        System.out.println("Do you want to play again ?");
        String PA=sc.next();
        play_again=PA.equalsIgnoreCase("y");
    }
}

public static int getRandonNumber(int min,int max)
{
    return (int)(Math.random()*(max-min+1)+min);
}
}
