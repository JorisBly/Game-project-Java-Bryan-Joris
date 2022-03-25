public class Damageskill {
    String name;
    Integer damage;
    Integer vampire;
    Integer actionPoint;


    public Damageskill(String name, int damage, int vampire, int actionPoint) {
        this.name = name;
        this.damage = damage;
        this.vampire = vampire;
        this.actionPoint = actionPoint;


    }

public void damageSkill(){
        Damageskill fireBall = new Damageskill("Boule de feu", 35, 10,3);
        Damageskill charge = new Damageskill("charge", 35, 10,1);
        Damageskill blazingFire = new Damageskill("tir flamboyant", 35, 10,5);
        Damageskill swirlingAttack = new Damageskill("Attaque tournoyante", 35, 10,5);

}





}

