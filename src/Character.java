public class Character {
    String name;
    int pv;
    Damageskill attack1;
    Damageskill attack2;
    Damageskill attack3;
    Damageskill attack4;
    Classe classe;



    public Character(String name,int pv,Damageskill attack1, Damageskill attack2, Damageskill attack3, Damageskill attack4,Classe classe) {
        this.name = name;
        this.pv = pv;
        this.attack1 = attack1;
        this.attack2 = attack2;
        this.attack3 = attack3;
        this.attack4 = attack4;
        this.classe = classe;

    }


}
