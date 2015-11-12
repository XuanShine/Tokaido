/**
 * Created by xuan on 12/11/15.
 */
public class Tokaido {
    public static void main(String[] args) {
        IJoueur paul = new IJoueur("Paul");
        IJoueur jean = new IJoueur("Jean");

        Plateau plateau = new Plateau(paul, jean);
        while (!plateau.isFinPartie()) {
            System.out.println(plateau);
            System.out.println("============================================");
            IJoueur nextJoueur = plateau.tourDuJoueur();
            System.out.println("C'est au tour de " + nextJoueur.getNom());
            nextJoueur.avancer(2);
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
        }
        System.out.println(plateau);
        System.out.println("GAME OVER");
    }
}
