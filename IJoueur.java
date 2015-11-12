/**
 * Created by xuan on 11/11/15.
 */
public class IJoueur {
    private String nom;
    private int position;

    IJoueur(String nom) {
        this.nom = nom;
        this.position = 0;
    }

    public String getNom() {
        return nom;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void avancer(int n) {
        position += n;
        System.out.println(nom + " a avancé de " + n + " case(s)");
    }
}