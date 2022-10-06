import java.util.Scanner;

public class GuessGame {
    
    public void startGame(){    
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        System.out.println("Welcome to the Guessing Game");
        System.out.println("Thinking of a Number from 0 to 19....");

        Scanner s = new Scanner(System.in);
        int toguess = (int) (Math.random() * 20);
        char choice = 'y';

        System.out.println("The value to guess is: "+toguess);
        while(choice == 'y')
        {
            p1.guess();
            p2.guess();
            p3.guess();
            if(p1.number == toguess){
                System.out.println("player 1 is right!!!");
                return;
            }
            else if(p2.number == toguess){
                System.out.println("player 2 is right!!!");
                return;
            }
            else if(p3.number == toguess){
                System.out.println("player 3 is right!!!");
                return;
            }
            else{
                System.out.println("No one is right want them to guess again(y/n): ");
                choice = Character.toLowerCase(s.next().charAt(0));
            }
        }
        s.close();
    }
}
