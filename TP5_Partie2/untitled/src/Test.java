import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Voiture voiture = new Voiture();
        Portable portable = new Portable();
        int choix;
        do {
            System.out.println("\n1.Voiture  2.Portable  0.Quitter");
            choix = Integer.parseInt(sc.nextLine());
            if (choix == 1) menu(sc, voiture);
            else if (choix == 2) menu(sc, portable);
        } while (choix != 0);
    }

    static void menu(Scanner sc, GestionCarburant m) {
        int choix;
        do {
            System.out.println("\n1.Definir  2.Afficher  3.Remplir  4.Consommer  5.Jauge  6.Plein  0.Retour");
            choix = Integer.parseInt(sc.nextLine());
            switch (choix) {
                case 1:
                    if (m instanceof Voiture) ((Voiture) m).definirAttributs();
                    else ((Portable) m).definirAttributs();
                    break;
                case 2:
                    if (m instanceof Voiture) ((Voiture) m).afficherAttributs();
                    else ((Portable) m).afficherAttributs();
                    break;
                case 3:
                    System.out.print("Quantite : ");
                    double q = Double.parseDouble(sc.nextLine());
                    System.out.println("Quantite ajoutee : " + m.remplir(q));
                    break;
                case 4:
                    m.consommer();
                    System.out.println("Niveau apres consommation : " + m.jauge());
                    break;
                case 5:
                    System.out.println("Niveau actuel : " + m.jauge());
                    break;
                case 6:
                    m.plein();
                    break;
            }
        } while (choix != 0);
    }
}