public abstract class Appareils implements GestionCarburant{
    protected String marque;
    protected TypeCarburant typeCarburant;
    protected double niveau;
    protected boolean rechargeable;
    protected final int MAX=100;
    public Appareils(String marque, TypeCarburant typeCarburant, double niveau){
        this.marque = marque;
        this.typeCarburant = typeCarburant;
        this.niveau = niveau;
        setType(typeCarburant);
    }
    public Appareils(){ setType(TypeCarburant.BATTERIES); }
    public double jauge(){
        return niveau;
    }
    public double remplir(double quantite){
        if (quantite < 0) { System.out.println("Quantite invalide"); return 0; }
        double espace = MAX - niveau;
        if (quantite <= espace) { niveau += quantite; return quantite; }
        plein();
        return espace;
    }
    public void plein(){
        System.out.println("Appareil Charge");
        niveau = MAX;
    }
    public void setType(TypeCarburant typeCarburant){
        this.typeCarburant = typeCarburant;
        this.rechargeable = typeCarburant == TypeCarburant.BATTERIES
                || typeCarburant == TypeCarburant.PILESRECHARGEABLES;
    }

}
