public abstract class Vehicules implements GestionCarburant{
    protected String marque;
    protected TypeCarburant typeCarburant;
    protected double reservoir;
    protected double niveau;
    protected double prix;
    protected double consommation;
    public Vehicules(){
        this.typeCarburant = TypeCarburant.ESSENCE;
    }
    public Vehicules(String marque, double reservoir, double niveau, double prix,double consommation) {
        this.marque = marque;
        this.reservoir = reservoir;
        this.niveau = niveau;
        this.prix = prix;
        this.consommation = consommation;
        this.typeCarburant = TypeCarburant.ESSENCE;
    }
    public double jauge(){
        return niveau;
    }
    public void consommer(){
        if (consommation <= niveau)
            niveau -=consommation;
    }
    public double remplir(double quantite){
        if (quantite < 0) { System.out.println("Quantite invalide"); return 0; }
        double espace = reservoir - niveau;
        if (quantite <= espace) { niveau += quantite; return quantite; }
        plein();
        return espace;
    }

    public void plein(){
        System.out.println("Reservoir plein !");
        niveau = reservoir;
    }

}
