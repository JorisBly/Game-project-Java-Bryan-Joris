import java.util.ArrayList;
import java.util.Scanner;

public class Game {

    Character character;
    Boss boss;

    public Game(Character character, Boss boss) {
        this.character = character;
        this.boss = boss;

    }

    public static void main(String[] args) {

        // Crée toutes les capacité du jeux
        Damageskill fireBall = new Damageskill("Boule de feu", 35, 10, 3);
        Damageskill charge = new Damageskill("Charge", 35, 10, 1);
        Damageskill blazingFire = new Damageskill("Tir flamboyant", 35, 10, 5);
        Damageskill swirlingAttack = new Damageskill("Attaque tournoyante", 35, 10, 5);


        // Crée un array list et y stocker les capacité

        ArrayList<Object> skill = new ArrayList<>();
        skill.add(fireBall);
        skill.add(charge);
        skill.add(blazingFire);
        skill.add(swirlingAttack);

        Scanner gameScan = new Scanner(System.in);
        System.out.print("Voulez vous jouer ? y/n: ");

        String answer = gameScan.nextLine();

        if (answer.equals("y")) {
            Scanner nameScan = new Scanner(System.in);
            System.out.println("Entrez le nom de votre personnage");
            String nameCharacter = nameScan.nextLine();

            System.out.println("Entrez les pv de votre personnage");
            int pvCharacter = nameScan.nextInt();

            int countAttack = 0;
            int[] attackCharacterNumber = new int[4];
            while (countAttack < 4) {

                System.out.println("Selectionner votre attaque\n" +
                        "1) Boule de feu\n" +
                        "2) Charge \n" +
                        "3) Tir flamboyant\n" +
                        "4) Attaque tournoyante");
                attackCharacterNumber[countAttack] = nameScan.nextInt();
                countAttack++;
            }

            int attackOne = attackCharacterNumber[0] - 1 ;
            int attackTwo = attackCharacterNumber[1] - 1;
            int attackThree = attackCharacterNumber[2] - 1;
            int attackFour = attackCharacterNumber[3] - 1;

            System.out.println("Votre nom: " + nameCharacter + "\n" +
                    "Vos PV: " + pvCharacter + "\n" +
                    "attaque 1: " + skill.get(attackOne) + "\n" +
                    "attaque 2: " + skill.get(attackTwo) + "\n" +
                    "attaque 3: " + skill.get(attackThree) + "\n" +
                    "attaque 4: " + skill.get(attackFour) + "\n");
           //  Character myCharacter = new Character(nameCharacter, pvCharacter, skill.get(attackOne),skill.get(attackTwo),skill.get(attackThree),skill.get(attackFour));


        } else { // --------------------------------------- Fin du processus ------------------------------------------------------------------- //
            System.out.print("Ah bah tu sais pas ce que tu rates mon gars");
        }


    }


}