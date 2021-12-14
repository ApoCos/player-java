public class Player {
    
        private String name ;
        private double health ;
        private double attack = 100 * Math.random();
        // private double defense ;
    
    // on crée le constructeur du joueur
    public Player (String name, double health /*, double attack , double defense */) {
        this.name = name; /* on récupère chaque valeur de name*/
        this.health = health;
        // this.attack = attack;
        // this.defense = defense;
    }    
    //

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public double getHealth() {
        return health;
    }
    
    public void setHealth(double health) {
        this.health = health;
    }

    //on crée la methode qui permet de soustraire les points de vie après une attaque
    public void damage(double damage) {
        this.health -= damage;
        System.out.println(name + " vient de subir " + damage + " dégats.");
    }
    //

    public double getAttack() {
        return attack;
    }
    
    public void setAttack(double attack) {
        this.attack = attack;
    }

    // public double getDefense() {
    //     return defense;
    // }
    
    // public void setdefense(double defense) {
    //     this.defense = defense;
    // }
}
