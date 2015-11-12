package zoo;

public class Zona {
    private int ID;
    private String nom;
    private int superficie;
    private boolean net;

    public Zona(int ID, String nom, int superficie, boolean net) {
        this.ID = ID;
        this.nom = nom;
        this.superficie = superficie;
        this.net = net;
    }

    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public boolean isNet() {
        return net;
    }

    public void setNet(boolean net) {
        this.net = net;
    }

    @Override
    public String toString() {
        return "L'animal està a la zona "+nom;
    }

    
    
}
