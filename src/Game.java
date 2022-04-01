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

createCharacterIfSetYes(startGame());
        System.out.println(createTheCharacter());


    }

    public static String startGame() {

        Scanner gameScan = new Scanner(System.in);
        System.out.print("Voulez vous jouer ? y/n: ");

        String answer = gameScan.nextLine();

        return answer;
    }

    public static void createCharacterIfSetYes(String answer) {
        if (answer.equals("y")) {

            System.out.println("Excellent choix !!!");

        } else {
            // --------------------------------------- Fin du processus ------------------------------------------------------------------- //
            System.out.print("Ah bah tu sais pas ce que tu rates mon gars");
        }


    }


    public static Character createTheCharacter() {

        Damageskill fireBall = new Damageskill("Boule de feu", 35, 10, 3);
        Damageskill charge = new Damageskill("Charge", 35, 10, 1);
        Damageskill blazingFire = new Damageskill("Tir flamboyant", 35, 10, 5);
        Damageskill swirlingAttack = new Damageskill("Attaque tournoyante", 35, 10, 5);


        // Crée un array list et y stocker les capacité

        ArrayList<Damageskill> skill = new ArrayList<>();
        skill.add(fireBall);
        skill.add(charge);
        skill.add(blazingFire);
        skill.add(swirlingAttack);

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
        int attackOne = attackCharacterNumber[0] - 1;
        int attackTwo = attackCharacterNumber[1] - 1;
        int attackThree = attackCharacterNumber[2] - 1;
        int attackFour = attackCharacterNumber[3] - 1;

        Character myCharacter = new Character(nameCharacter, pvCharacter, skill.get(attackOne), skill.get(attackTwo), skill.get(attackThree), skill.get(attackFour));

        System.out.println("Votre nom: " + nameCharacter + "\n" +
                "Vos PV: " + pvCharacter + "\n" +
                "attaque 1: " + skill.get(attackOne) + "\n" +
                "attaque 2: " + skill.get(attackTwo) + "\n" +
                "attaque 3: " + skill.get(attackThree) + "\n" +
                "attaque 4: " + skill.get(attackFour) + "\n");

        return myCharacter;

    }
}






     /*
                 -----------------------------------------------Création de perso-----------------------------------------------------------------------------------------

      Damageskill fireBall = new Damageskill("Boule de feu", 35, 10, 3);
        Damageskill charge = new Damageskill("Charge", 35, 10, 1);
        Damageskill blazingFire = new Damageskill("Tir flamboyant", 35, 10, 5);
        Damageskill swirlingAttack = new Damageskill("Attaque tournoyante", 35, 10, 5);


        // Crée un array list et y stocker les capacité

        ArrayList<Damageskill> skill = new ArrayList<>();
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

            int attackOne = attackCharacterNumber[0] - 1;
            int attackTwo = attackCharacterNumber[1] - 1;
            int attackThree = attackCharacterNumber[2] - 1;
            int attackFour = attackCharacterNumber[3] - 1;


            System.out.println("Votre nom: " + nameCharacter + "\n" +
                    "Vos PV: " + pvCharacter + "\n" +
                    "attaque 1: " + skill.get(attackOne) + "\n" +
                    "attaque 2: " + skill.get(attackTwo) + "\n" +
                    "attaque 3: " + skill.get(attackThree) + "\n" +
                    "attaque 4: " + skill.get(attackFour) + "\n");

            Character myCharacter = new Character(nameCharacter, pvCharacter, skill.get(attackOne), skill.get(attackTwo), skill.get(attackThree), skill.get(attackFour));

            ArrayList<Damageskill> skillOfMyCharacter = new ArrayList<>();
            skill.add(myCharacter.attackCharacter1);
            skill.add(myCharacter.attackCharacter2);
            skill.add(myCharacter.attackCharacter3);
            skill.add(myCharacter.attackCharacter4);
            -----------------------------------------------Création de perso-----------------------------------------------------------------------------------------
            */
       /* Boss theBoss = new Boss("Golgoth", 600, skill.get(0), skill.get(1), skill.get(2), skill.get(3));

        System.out.println(theBoss);

        while (myCharacter.pv > 0 && theBoss.pv > 0) {
            Scanner attackScan = new Scanner(System.in);
            System.out.println("Choisisser une attaque 1/ 2/ 3/ 4 :\n" +
                    "1 : \n" + myCharacter.attackCharacter1.name + "\n" + "\n" +
                    "2 : \n" + myCharacter.attackCharacter2 + "\n" + "\n" +
                    "3 : \n" + myCharacter.attackCharacter3 + "\n" + "\n" +
                    "4 : \n" + myCharacter.attackCharacter4 + "\n" + "\n");
            int attackSelect = attackScan.nextInt() - 1;
            if (attackSelect >= 0 && attackSelect <= 3) {
                switch (attackSelect) {
                    case 1:
                        attackSelect = 0;
                        theBoss.pv -= myCharacter.attackCharacter1.damage;
                        break;

                }


            }

        }


    } else
    {
        // --------------------------------------- Fin du processus ------------------------------------------------------------------- //
        System.out.print("Ah bah tu sais pas ce que tu rates mon gars");
    }
*/


