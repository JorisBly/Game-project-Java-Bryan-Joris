public class Character {
    String name;
    int pv;
    int attack1;
    Damageskill attack2;
    Damageskill attack3;
    Damageskill attack4;



   /* public Character(String name,int pv,Damageskill attack1, Damageskill attack2, Damageskill attack3, Damageskill attack4) {
        this.name = name;
        this.pv = pv;
        this.attack1 = attack1;
        this.attack2 = attack2;
        this.attack3 = attack3;
        this.attack4 = attack4;

    }*/


    public Character(String nameCharacter, int pvCharacter, int attackCharacter) {
        this.name = nameCharacter;
        this.pv = pvCharacter;
        this.attack1 = attackCharacter;
    }
}
