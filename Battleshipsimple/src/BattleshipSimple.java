import java.util.Scanner;
public class BattleshipSimple{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int hits = 0 , givguess ,temp=guess();
        int[] corguess = new int[3];
        corguess[0]=temp;
        corguess[1]=temp+1;
        corguess[2]=temp+2;
        System.out.println("Guess has been selected");
        while(true){
            boolean flag = true;
            System.out.print("Enter a guess (between 0 to 6): ");
            givguess=s.nextInt();
            for(int i:corguess){
                if(i==givguess){
                    System.out.println("Hit");
                    hits++;
                    corguess[i]=-1;
                    flag=false;
                }
                
            }
            if(flag==true)
            System.out.println("Miss");
            if(hits == 3){
                System.out.println("Kill");
                System.out.println(dotcom()+" Sunk");
                break;
            }
        }
        s.close(); 
    }
    public static int guess(){
        int n = ((int)Math.random())*4;
        return n;
    }
    public static String dotcom(){
        String [][] name = {
            {"Sinkme.com"},{"Die.com"},{"sorry.com"},{"sad.com"},{"bad.com"}
        };
        int n = (int)Math.random()*4;
        System.out.print(n);
        return name[n][0];
    }
}


