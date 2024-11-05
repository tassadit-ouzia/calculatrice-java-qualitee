java
/**
 * Représente une opération de multiplication entre deux expressions.
 * Cette classe étend {@link Operation} et implémente {@link Operation#valeur()}.
 * 
 * @author Ouzia Tassadit
 * @version 2.0
 */
public class Multiplication extends Operation {

    /**
     * Constructeur de la classe Multiplication.
     * 
     * @param operande1 Le premier opérande.
     * @param operande2 Le deuxième opérande.
     */
    public Multiplication(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    /**
     * Calcule la valeur de la multiplication des deux opérandes.
     * 
     * @return Le produit des deux opérandes.
     */
    public double valeur() {
        return getOperande1().valeur() * getOperande2().valeur();
    }
    
    /**
     * Retourne la représentation sous forme de chaîne de caractères de 
     * l'opération de multiplication.
     * 
     * @return La chaîne représentant l'opération.
     */
    public String toString() {
        return "(" + getOperande1() + " * " + getOperande2() + ")";
    }
    }
