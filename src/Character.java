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


    public Character(String nameCharacter, int pvCharacter, Damageskill attackCharacter1,Damageskill attackCharacter2,Damageskill attackCharacter3,Damageskill attackCharacter4) {
        this.name = nameCharacter;
        this.pv = pvCharacter;
        this.attackCharacter1 = attackCharacter1;
        this.attackCharacter2 = attackCharacter2;
        this.attackCharacter3 = attackCharacter3;
        this.attackCharacter4 = attackCharacter4;
    }
}
