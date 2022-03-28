public class Damageskill {
    String name;
    Integer damage;
    Integer vampire;
    Integer actionPoint;

    @Override
    public String toString() {
        return
                name + " | " +
                 "Dégats : " + damage + " " +
                        "Vampirisme : " +  vampire + " " +
                        "Coûts en PA : " +  actionPoint +
                '}';
    }

    public Damageskill(String name, int damage, int vampire, int actionPoint) {
        this.name = name;
        this.damage = damage;
        this.vampire = vampire;
        this.actionPoint = actionPoint;


    }







}

