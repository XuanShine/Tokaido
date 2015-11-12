/**
 * Created by xuan on 11/11/15.
 */
public class Case {

    private String nom;
    private Joueur contenu;

    Case(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public Joueur getContenu() {
        return contenu;
    }

    public void setContenu(Joueur contenu) {
        this.contenu = contenu;
    }
}
