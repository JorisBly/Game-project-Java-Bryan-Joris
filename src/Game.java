import java.util.Scanner;
public class Game {

    Character character;
    Boss boss;

    public Game(Character character, Boss boss) {
        this.character = character;
        this.boss = boss;

    }

    public static void main(String[] args) {
        Scanner gameScan = new Scanner(System.in);
        System.out.print("Voulez vous jouer ? y/n: ");

        String answer = gameScan.nextLine();

        if (answer.equals("y")) {
            Scanner nameScan = new Scanner(System.in);
            System.out.println("Entrez le nom de votre personnage");
            String nameCharacter =  nameScan.nextLine();

            System.out.println("Entrez les pv de votre personnage");
            int pvCharacter =  nameScan.nextInt();

            System.out.println("Selectionner votre attaque\n" +
                    "1) Boule de feu\n" +
                    "2) Charge \n" +
                    "3) Tir flamboyant\n" +
                    "4) Attaque tournoyante");
            int attackCharacter =  nameScan.nextInt();
            if (attackCharacter == 1 ){
                Damageskill fireBall = new Damageskill("Boule de feu", 35, 10,3);
            }else if (attackCharacter == 2){
                Damageskill charge = new Damageskill("charge", 35, 10,1);
            }else if (attackCharacter == 3){
                Damageskill blazingFire = new Damageskill("tir flamboyant", 35, 10,5);
            }else {
                Damageskill swirlingAttack = new Damageskill("Attaque tournoyante", 35, 10,5);
            }


        } else {
            System.out.print("Ah bah tu sais pas ce que tu rates mon gars");
        }


    }
}