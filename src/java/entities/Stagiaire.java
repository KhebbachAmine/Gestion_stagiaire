package entities;

/**
 *
 * @author acer
 */
public class Stagiaire
{
    private String cin;
    private String nom;
    private String tel;
    private String email;
    private String genre;
    private String etablissement;
    private String filiere;

    public String getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public String getGenre() {
        return genre;
    }

    public String getEtablissement() {
        return etablissement;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setEtablissement(String etablissement) {
        this.etablissement = etablissement;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public Stagiaire() {
    }

    public Stagiaire(String cin, String nom, String tel, String email, String genre, String etablissement, String filiere) {
        this.cin = cin;
        this.nom = nom;
        this.tel = tel;
        this.email = email;
        this.genre = genre;
        this.etablissement = etablissement;
        this.filiere = filiere;
    }

    @Override
    public String toString() {
        return "Stagiaire{" + "cin=" + cin + ", nom=" + nom + ", tel=" + tel + ", email=" + email + ", genre=" + genre + ", etablissement=" + etablissement + ", filiere=" + filiere + '}';
    }
    
    
    
}
