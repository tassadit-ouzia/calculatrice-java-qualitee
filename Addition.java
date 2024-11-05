java
/**
 * Représente une opération d'addition entre deux expressions.
 * Cette classe étend la classe abstraite {@link Operation}.
 * 
 * @author Ouzia Tassadit
 * @version 2.0
 */
public class Addition extends Operation {

    /**
     * Constructeur de l'addition qui initialise les deux opérandes.
     * 
     * @param operande1 Le premier opérande de l'addition.
     * @param operande2 Le second opérande de l'addition.
     */public Addition(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    /**
     * Calcule la valeur de l'addition en additionnant les valeurs des opérandes.
     * 
     * @return La somme des deux opérandes.
     */
    @Override
    public double valeur() {return operande1.valeur() + operande2.valeur();
    }

    /**
     * Retourne une représentation sous forme de chaîne de l'addition.
     * Par exemple, "(5 + 3)".
     * 
     * @return Une chaîne représentant l'opération.
     */
    @Override
    public String toString() {
        return "(" + operande1 + " + " + operande2 + ")";
    }
}
