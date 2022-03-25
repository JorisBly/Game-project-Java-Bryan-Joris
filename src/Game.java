import java.util.Scanner;

public class Game {

    Character character;
    Character ennemy;

    public static void main(String args[]){
        Damageskill fireBall = new Damageskill("Boule de feu", 35, 10,3);
        Damageskill charge = new Damageskill("charge", 35, 10,1);
        Damageskill blazingFire = new Damageskill("tir flamboyant", 35, 10,5);
        Damageskill swirlingAttack = new Damageskill("Attaque tournoyante", 35, 10,5);
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
