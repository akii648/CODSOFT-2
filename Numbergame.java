import java.util.Scanner;
public class Numbergame{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int chances=8;
        int finals=0;
        int rand=getrandN(1,100);
        boolean playAgain=true;
        System.out.println("welcome Buddy");
        System.out.println("Hyy Buddy you have about"+chances+"to win the game ");
        while(playAgain){
            int rand=getrandN(1,100);
            boolean guess=false;
            for(int i=0;i<chances;i++){
                System.out.println("chances"+(i+1)+"enter your guess");
                int user=sc.nextInt();
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println("You Won it");
                    break;
                }
                else if(user>guess){
                    System.out.println("Too high");
                }
                else{
                    System.out.println("too Low");
                }
            }
            if (guess==false){
                System.out.println("Sorry Buddy. You lost the chances.The number is "+rand);
            }
            System.out.println("Do you want to play again(y/n)");
           string pA=sc.next();
           playAgain=pA.equalsIgnoreCase("y");
        }
        System.out.println("That's it Buddy,Hope you enjoyed it");
        System.out.println("here is your scores"+finals);
    }
    public static int getrandN(int min,int max){
        return(int)(Math.random()*(max-min+1)+min);
    }
}