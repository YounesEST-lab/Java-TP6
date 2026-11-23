import java.util.Scanner;

public class Portable extends Appareils {
    TypePortable type = TypePortable.GSM;
    boolean wap;
    double consommation;

    public Portable() { super(); }

    public Portable(String marque, double niveau, TypePortable type, boolean wap, double consommation) {
        super(marque, TypeCarburant.BATTERIES, niveau);
        this.type = type; this.wap = wap; this.consommation = consommation;
    }

    public void consommer() {
        if (consommation <= niveau) niveau -= consommation;
    }

    public void afficherAttributs() {
        System.out.println("Marque : " + marque + " || Carburant : " + typeCarburant + " || Rechargeable : " + rechargeable
                + " || Niveau : " + niveau + " || Type : " + type + " || WAP : " + wap + " || Conso/h : " + consommation + "%");
    }

    public void definirAttributs() {
        Scanner sc = new Scanner(System.in);
        int choix;
        do {
            System.out.println("1.Marque 2.Carburant 3.Niveau 4.Type 5.WAP 6.Consommation 0.Retour");
            choix = Integer.parseInt(sc.nextLine());
            if (choix != 0) System.out.print("Valeur : ");
            try {
                switch (choix) {
                    case 1: marque = sc.nextLine(); break;
                    case 2: setType(TypeCarburant.valueOf(sc.nextLine().toUpperCase())); break; // PILES, PILESRECHARGEABLES, BATTERIES
                    case 3: niveau = Double.parseDouble(sc.nextLine()); break;
                    case 4: type = TypePortable.valueOf(sc.nextLine().toUpperCase()); break;     // GSM, AMPS, NTM
                    case 5: wap = Boolean.parseBoolean(sc.nextLine()); break;
                    case 6: consommation = Double.parseDouble(sc.nextLine()); break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Valeur invalide");
            }
        } while (choix != 0);
    }
}