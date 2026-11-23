import java.util.Scanner;
public class Voiture extends Vehicules{
    int passagers;
    String typeMoteur;
    int numeroMoteur;
    int chassis;
    String couleur;
    public Voiture() { super(); }
    public Voiture(String marque, double reservoir, double niveau, double prix,double consommation,int passagers,String typeMoteur,int numeroMoteur,int chassis,String couleur){
        super(marque,reservoir,niveau,prix,consommation);
        this.passagers = passagers;
        this.typeMoteur = typeMoteur;
        this.numeroMoteur = numeroMoteur;
        this.chassis = chassis;
        this.couleur = couleur;
    }
    public void afficherAttributs() {
        System.out.println("Marque : " + marque + " || Reservoir : " + reservoir + " || Niveau : " + niveau
                + " || Prix : " + prix + " || Conso/100km : " + consommation + " || Passagers : " + passagers
                + " || Moteur : " + typeMoteur + " || N° moteur : " + numeroMoteur
                + " || Châssis : " + chassis + " || Couleur : " + couleur);
    }
    public void definirAttributs() {
        Scanner sc = new Scanner(System.in);
        int choix;
        do {
            System.out.println("1.Marque 2.Reservoir 3.Niveau 4.Prix 5.Consommation 6.Passagers "
                    + "7.Type moteur 8.N° moteur 9.Châssis 10.Couleur 0.Retour");
            choix = Integer.parseInt(sc.nextLine());
            if (choix != 0) System.out.print("Valeur : ");
            try {
                switch (choix) {
                    case 1: marque = sc.nextLine(); break;
                    case 2: reservoir = Double.parseDouble(sc.nextLine()); break;
                    case 3: niveau = Double.parseDouble(sc.nextLine()); break;
                    case 4: prix = Double.parseDouble(sc.nextLine()); break;
                    case 5: consommation = Double.parseDouble(sc.nextLine()); break;
                    case 6: passagers = Integer.parseInt(sc.nextLine()); break;
                    case 7: typeMoteur = sc.nextLine(); break;
                    case 8: numeroMoteur = Integer.parseInt(sc.nextLine()); break;
                    case 9: chassis = Integer.parseInt(sc.nextLine()); break;
                    case 10: couleur = sc.nextLine(); break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Valeur invalide");
            }
        } while (choix != 0);
    }
}
