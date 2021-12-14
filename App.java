public class App {
    public static void main(String[] args) {
        //on crée une instance de player (un joueur)
        Player player1 = new Player("Anakin", 20.0 /*, 50.0*/);

        //on crée un second joueur
        Player player2 = new Player("Dark Vador", 20.0 /*, 70.0*/);

        System.out.println("Nom : " + player1.getName());
        System.out.println("vie : " + player1.getHealth());
        
        System.out.println("Nom : " + player2.getName());
        System.out.println("vie : " + player2.getHealth());

        if (player1.getHealth() != 0 || player2.getHealth() != 0) {
            player1.damage(player2.getAttack());        
            System.out.println("vie restante: " + player1.getHealth());

            player2.damage(player1.getAttack());
            System.out.println("vie restante: " + player2.getHealth());
        }
        
        // issue du combat
        if(player1.getHealth()>player2.getHealth() && player1.getHealth()>0){
            System.out.println(player1.getName() + " a gagné !");
        }

        if(player2.getHealth()>player1.getHealth()  && player2.getHealth()>0){
            System.out.println(player2.getName() + " a gagné !");
        }
    }
}
