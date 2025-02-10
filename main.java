// Classe de base Personne
class Personne {
    protected String nom;
    protected int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void afficher() {
        System.out.println("Nom: " + nom + ", Age: " + age);
    }
}

// Classe Etudiant
class Etudiant extends Personne {
    private String matricule;

    public Etudiant(String nom, int age, String matricule) {
        super(nom, age);
        this.matricule = matricule;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Matricule: " + matricule);
    }
}

// Classe Professeur
class Professeur extends Personne {
    private String specialite;

    public Professeur(String nom, int age, String specialite) {
        super(nom, age);
        this.specialite = specialite;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Spécialité: " + specialite);
    }
}

// Classe Ecole
import java.util.ArrayList;
class Ecole {
    private String nom;
    private ArrayList<Etudiant> etudiants;
    private ArrayList<Professeur> professeurs;

    public Ecole(String nom) {
        this.nom = nom;
        this.etudiants = new ArrayList<>();
        this.professeurs = new ArrayList<>();
    }

    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    public void ajouterProfesseur(Professeur p) {
        professeurs.add(p);
    }

    public void afficherEcole() {
        System.out.println("École: " + nom);
        System.out.println("Étudiants:");
        for (Etudiant e : etudiants) {
            e.afficher();
        }
        System.out.println("Professeurs:");
        for (Professeur p : professeurs) {
            p.afficher();
        }
    }
}

// Classe principale Main
public class Main {
    public static void main(String[] args) {
        Ecole ecole = new Ecole("Université XYZ");
        
        Etudiant et1 = new Etudiant("Alice", 20, "E1234");
        Etudiant et2 = new Etudiant("Bob", 22, "E5678");
        
        Professeur pr1 = new Professeur("Dr. Smith", 45, "Mathématiques");
        Professeur pr2 = new Professeur("Mme. Dupont", 38, "Informatique");
        
        ecole.ajouterEtudiant(et1);
        ecole.ajouterEtudiant(et2);
        
        ecole.ajouterProfesseur(pr1);
        ecole.ajouterProfesseur(pr2);
        
        ecole.afficherEcole();
    }
}
