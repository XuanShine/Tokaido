/**
 * Created by xuan on 11/11/15.
 */
public class Plateau {

    private Case[] listCase = {new Case("Depart"), new Case("1"), new Case("2"), new Case("3"), new Case("4"), new Case("Fin")};
    private Joueur[] listJoueur;
    private int DEPART = 0;
    private int FIN = listCase.length - 1;

    Plateau(Joueur joueur, Joueur j2) {
        listJoueur = new Joueur[2];
        listJoueur[0] = joueur;
        listJoueur[1] = j2;

        // À l'initialisation, le joueur est sur la case de départ.
        listCase[0].setContenu(joueur);
        joueur.setPosition(0);
        listCase[1].setContenu(j2);
        j2.setPosition(1);
    }

    public Case getCase(int n) {
        return listCase[n];
    }

    public void enleverJoueur(Joueur joueur) {
        for (Case theCase : listCase) {
            if (theCase.getContenu() == joueur) {
                theCase.setContenu(null);
                return;
            }
        }
        throw new Error("Pas de joueur " + joueur.getNom() + " dans le jeu");
    }

    public void placerJoueur(Joueur joueur, int theCase) {
        if (listCase[theCase].getContenu() == null) {
            listCase[theCase].setContenu(joueur);
        } else {
            throw new Error("Déjà un joueur dans cette case !");
            //placerJoueur(joueur, theCase + 1);
        }
    }

    public boolean isFinPartie() {
        return getCase(FIN).getContenu() != null;
    }

    public Joueur tourDuJoueur() {
        for (Case theCase : listCase) {
            if (theCase.getContenu() != null) {
                return theCase.getContenu();
            }
        }
        throw new Error("Plateau vide");
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        for (Case theCase : listCase) {
            String contenu;
            if (theCase.getContenu() != null) {
                contenu = theCase.getContenu().getNom();
            } else {
                contenu = "";
            }
            buffer.append("Case " + theCase.getNom() + ": " + contenu + "\n");
        }
        return buffer.toString();
    }
}
