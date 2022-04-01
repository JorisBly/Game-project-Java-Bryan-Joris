public class Boss {
    String name;
    int pv;
    Damageskill attack1;
    Damageskill attack2;
    Damageskill attack3;
    Damageskill attack4;


    @Override
    public String toString() {
        return "Boss 1 :\n" + "\n" +
                " Nom : " + name + "\n" +
                " Points de vies : " + pv + "\n" + "\n" +
                "Attaque 1 : \n" + attack1 + "\n" + "\n" +
                "Attaque 2 : \n" + attack2 + "\n" + "\n" +
                "Attaque 3 : \n" + attack3 + "\n" + "\n" +
                "Attaque 4 : \n" + attack4 + "\n" + "\n" ;
    }


    public Boss(String name, int pv, Damageskill attack1, Damageskill attack2, Damageskill attack3, Damageskill attack4) {
        this.name = name;
        this.pv = pv;
        this.attack1 = attack1;
        this.attack2 = attack2;
        this.attack3 = attack3;
        this.attack4 = attack4;
    }
}
