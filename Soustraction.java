/**
 * Représente une opération de soustraction entre deux expressions.
 * Cette classe étend {@link Operation} et implémente {@link Operation#valeur()}.
 * 
 * @author Ouzia Tassadit
 * @version 2.0
 */
public class Soustraction extends Operation {

    /**
     * Constructeur de la classe Soustraction.
     * 
     * @param operande1 Le premier opérande.
     * @param operande2 Le deuxième opérande.
     */
     public Soustraction(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    /**
     * Calcule la valeur de la soustraction des deux opérandes.
     * 
     * @return La différence entre les deux opérandes.
     */
    public double valeur() {
        return getOperande1().valeur() - getOperande2().valeur();
    }
    
    /**
     * Retourne la représentation sous forme de chaîne de caractères de 
     * l'opération de soustraction.
     * 
     * @return La chaîne représentant l'opération.
     */
    public String toString() {
        return "(" + getOperande1() + " - " + getOperande2() + ")";
    }
}
