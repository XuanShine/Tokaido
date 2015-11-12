/**
 * Created by xuan on 12/11/15.
 */
public class Tokaido {
    public static void main(String[] args) {
        Joueur paul = new Joueur("Paul");
        Joueur jean = new Joueur("Jean");

        Plateau plateau = new Plateau(paul, jean);
        plateau.pl
        while (!plateau.isFinPartie()) {
            System.out.println(plateau);
            System.out.println("============================================");
            Joueur nextJoueur = plateau.tourDuJoueur();
            System.out.println("C'est au tour de " + nextJoueur.getNom());
            nextJoueur.avancer(2, plateau);
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
        }
        System.out.println(plateau);
        System.out.println("GAME OVER");
    }
}
