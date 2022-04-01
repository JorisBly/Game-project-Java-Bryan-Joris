public class Character {
    String name;
    int pv;
    Damageskill attackCharacter1;
    Damageskill attackCharacter2;
    Damageskill attackCharacter3;
    Damageskill attackCharacter4;




   /* public Character(String name,int pv,Damageskill attack1, Damageskill attack2, Damageskill attack3, Damageskill attack4) {
        this.name = name;
        this.pv = pv;
        this.attack1 = attack1;
        this.attack2 = attack2;
        this.attack3 = attack3;
        this.attack4 = attack4;

    }*/

    @Override
    public String toString() {
        return "Votre personnage :\n" + "\n" +
                " Nom : " + name + "\n" + "\n" +
                " Points de vies : " + pv + "\n" +
                "Attaque 1 : \n" + attackCharacter1 + "\n" + "\n" +
                "Attaque 2 : \n" + attackCharacter2 + "\n" + "\n" +
                "Attaque 3 : \n" + attackCharacter3 + "\n" + "\n" +
                "Attaque 4 : \n" + attackCharacter4 + "\n" + "\n" + "\n" + "---------------------------------------------------------------------------" ;
    }

    public Character(String nameCharacter, int pvCharacter, Damageskill attackCharacter1, Damageskill attackCharacter2, Damageskill attackCharacter3, Damageskill attackCharacter4) {
        this.name = nameCharacter;
        this.pv = pvCharacter;
        this.attackCharacter1 = attackCharacter1;
        this.attackCharacter2 = attackCharacter2;
        this.attackCharacter3 = attackCharacter3;
        this.attackCharacter4 = attackCharacter4;
    }
}
