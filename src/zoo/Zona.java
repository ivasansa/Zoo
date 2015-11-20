package zoo;

public class Zona {
    private int ID;
    private String nom;
    private int superficie;
    private boolean net;

    /**
     * Constructor de la classe Zona
     * @param ID Identificador de la Zona
     * @param nom  Nom de la Zona
     * @param superficie Superfície en metres2
     * @param net Estat higiènci de la Zona
     */
    public Zona(int ID, String nom, int superficie, boolean net) {
        this.ID = ID;
        this.nom = nom;
        this.superficie = superficie;
        this.net = net;
        System.out.println("S'ha creat la zona "+nom);
    }

    
    
    /**
     * Getter del atribut ID
     * @return DNI que retorna el ID de la Classe Zona
     */
    public int getID() {
        return ID;
    }
/**
     * Setter del atribut ID
     * @param ID que es un integer de la Classe Zona 
     */
    public void setID(int ID) {
        this.ID = ID;
    }
/**
     * Getter del atribut nom
     * @return nom que retorna el nom de la Classe Zona
     */
    public String getNom() {
        return nom;
    }
/**
     * Setter del atribut nom
     * @param nom que es un integer de la Classe Zona 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
/**
     * Getter del atribut superficie
     * @return superficie que retorna la superficie de la Classe Zona
     */
    public int getSuperficie() {
        return superficie;
    }
/**
     * Setter del atribut superficie
     * @param superficie que es un integer de la Classe Zona 
     */
    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
/**
     * Getter del atribut net
     * @return net que retorna l'estat higienic de la Classe Zona
     */
    public boolean isNet() {
        return net;
    }
/**
     * Setter del atribut net
     * @param net que es un boolean de la Classe Zona 
     */
    public void setNet(boolean net) {
        this.net = net;
    }
    
    /**
     * Reimplementacio  del metode toString de l'objecte Object
     * @return  retorna la localitzacio de l'animal
     */
    @Override
    public String toString() {
        return "L'animal està a la zona "+nom;
    }

    
    
}