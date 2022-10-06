public class Player{
    int number;
    public void guess(){
        number = (int) (Math.random()*20);
        System.out.println("my guess : "+number);
    }
}