package animals;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import zoo.Zona;

/**
 * Classe que representa un Animal
 * @author ivan
 */
public class Animal {
    private Date dataIngres;
    private Sexe sexe;
    private Date dataSortida;
    private int ID;
    private String nomCientific;
    private String nom;
    private boolean malalt;
    private boolean net;
    private boolean teGana;
    private String dieta;
    private Zona zona;
    private Animal pare;
    private Animal mare;
    
    /**
     * Constructor de la classe Animal
     * Posa a Data d'avui l'atribut dataIngres i mostra una frase informativa
     * @param nom Nom de l'animal
     * @param pare  Objecte del Animal pare
     * @param mare Objecte del Animal mare
     */
    public Animal(String nom, Animal pare, Animal mare) {
        this.nom = nom;
        this.pare = pare;
        this.mare = mare;
        
        Calendar c = new GregorianCalendar();
        c.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        Date d1 = c.getTime(); //the midnight, that's the first second of the day.
        this.dataIngres = d1;
        
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
        String aux = sdf.format(d1);
        
        System.out.println(nom + " ha nascut el día "+aux) ;
        
    }
    /**
     * Constructor sobrecarregada de la classe Animal 
     * Posa a Data d'avui l'atribut dataIngres i mostra una frase informativa
     * @param nom Nom de l'animal
     */
    public Animal(String nom) {
        this.nom = nom;
        
        Calendar c = new GregorianCalendar();
        c.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        Date d1 = c.getTime(); //the midnight, that's the first second of the day.
        this.dataIngres = d1;
        
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
        String aux = sdf.format(d1);
        
        System.out.println(nom + " va ingresar al Zoo el día "+aux) ;
        
    }
    
    /**
     * Getter de l'atribut sexe
     * @return sexe Enum Sexe
     */
    public Sexe getSexe() {
        return sexe;
    }

    /**
     * Setter de l'atribut sexe
     * @param sexe Enum sexe
     */
    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    /**
     * Getter de l'atribut Pare
     * @return pare Objecte 
     */
    public Animal getPare() {
        return pare;
    }
    
    /**
     * Setter de l'atribut pare
     * @param pare Objecte Pare
     */
    public void setPare(Animal pare) {
        this.pare = pare;
    }

    /**
     * Getter de l'atribut Mare
     * @return Mare Objecte Mare
     */
    public Animal getMare() {
        return mare;
    }

    public void setMare(Animal mare) {
        this.mare = mare;
    }

    /**
     * Getter de l'atribut teGana
     * @return teGana bool
     */
    public boolean isTeGana() {
        return teGana;
    }

    /**
     * Setter de l'atribut teGana
     * @param teGana bool
     */
    public void setTeGana(boolean teGana) {
        this.teGana = teGana;
    }

    /**
     * Getter de l'atribut net
     * @return net bool
     */
    public boolean isNet() {
        return net;
    }

    /**
     * Setter de l'atribut net
     * @param net bool
     */
    public void setNet(boolean net) {
        this.net = net;
    }

    
    /**
     * Getter de l'atribut dataIngres
     * @return dataIngres Date
     */
    public Date getDataIngres() {
        return dataIngres;
    }

    /**
     * Setter de l'atribut dataIngres
     * @param dataIngres Date
     */
    public void setDataIngres(Date dataIngres) {
        this.dataIngres = dataIngres;
    }

    /**
     * Getter de l'atribut dataSortida
     * @return dataSortida Date
     */
    public Date getDataSortida() {
        return dataSortida;
    }

    /**
     * Setter de l'atribut dataSortida 
     * @param dataSortida Date
     */
    public void setDataSortida(Date dataSortida) {
        this.dataSortida = dataSortida;
    }

    /**
     * Getter de l'atribut ID
     * @return ID integer
     */
    public int getID() {
        return ID;
    }

    /**
     * Setter de l'atribut ID
     * @param ID integer
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * Getter de l'atribut nomCientific
     * @return nomCientific String
     */
    public String getNomCientific() {
        return nomCientific;
    }
    
    /**
     * Setter de l'atribut nomCientífic
     * @param nomCientific String
     */
    public void setNomCientific(String nomCientific) {
        this.nomCientific = nomCientific;
    }

    /**
     * Getter de l'atribut nom
     * @return nom String
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter de l'atribut nom
     * @param nom String
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter de l'atribut malalt
     * @return malalt boolean
     */
    public boolean isMalalt() {
        return malalt;
    }
    
    /**
     * Setter de l'atribut malalt
     * @param malalt boolean
     */
    public void setMalalt(boolean malalt) {
        this.malalt = malalt;
    }

    /**
     * Getter de l'atribut dieta
     * @return dieta String
     */
    public String getDieta() {
        return dieta;
    }
    
    /**
     * Setter de l'atribut dieta
     * @param dieta String
     */
    public void setDieta(String dieta) {
        this.dieta = dieta;
    }
    
    /**
     * Getter de l'atribut Zona
     * @return Zona Objecte Zona 
     */
    public Zona getZona() {
        return zona;
    }

    /**
     * Setter del atribut Zona
     * @param zona Objecte Zona
     */
    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
    /**
     * Métode morir, que posa l'atribut dataSortida a la data actual
     * mostra una frase informativa
     */
    public void morir(){
        Calendar c = new GregorianCalendar();
        c.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        Date d1 = c.getTime(); //the midnight, that's the first second of the day.
        this.dataSortida = d1;
        
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
        String aux = sdf.format(d1);
        
        System.out.println(nom + " ha mort el día "+aux) ;
    }
    
    /**
     * Mètode que posa l'atribut Zona de la Classe Animal a la Zona especificada
     * Treu per pantalla una frase informativa
     * @param z Objecte Zona on l'animal serà transportat
     */
    public void transportar(Zona z){
        this.zona = z;
        System.out.println("L'animal " + nom + " ha estat traslladat a la zona " + z.getNom());
    }
    
    @Override
    public String toString(){
        return "Nom: " + getNom();
    }
    
}

enum Sexe {
    MASCLE, FEMELLA;
}
