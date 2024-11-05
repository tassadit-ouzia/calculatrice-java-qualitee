/**
 * Représente un nombre avec une valeur {@code double}.
 * 
 * @author Ouzia Tassadit
 * @version 2.0
 */
public class Nombre extends Expression {
    
    private double valeur;

    /**
     * Constructeur du nombre.
     * 
     * @param valeur La valeur du nombre.
     */
    public Nombre(double valeur) {
        this.valeur = valeur;
    }

    /**
     * Retourne la valeur du nombre.
     * 
     * @return La valeur du nombre.
     */
    public double valeur() {
        return valeur;
    }

    /**
     * Retourne la valeur sous forme de chaîne.
     * 
     * @return La valeur en chaîne.
     */
    public String toString() {
        return String.valueOf(valeur);
    }
}