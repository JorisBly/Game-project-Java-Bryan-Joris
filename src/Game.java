import java.util.Scanner;

public class Game {

    Character character;
    Character ennemy;

    public static void main(String args[]){
        Scanner gameScan = new Scanner(System.in);
 System.out.print("Voulez vous jouer ? y/n: ");

 String answer = gameScan.nextLine();

 if (answer.equals("y")){

     System.out.print("Parfait !");
 }else {
     System.out.print("Ah bah tu sais pas ce que tu rates mon gars");
 }

    }


    public Game(Character character, Character ennemy){
        this.character = character;
        this.ennemy = ennemy;

    }
}
