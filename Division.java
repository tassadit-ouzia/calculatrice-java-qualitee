/**
 * Représente une opération de division entre deux expressions.
 * 
 * @author Ouzia Tassadit
 * @version 2.0
 */
public class Division extends Operation {

    /**
     * Constructeur de la division.
     * 
     * @param operande1 Le numérateur de la division.
     * @param operande2 Le dénominateur de la division.
     */
    public Division(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    /**
     * Calcule la valeur de la division des deux opérandes.
     * 
     * @return Le résultat de la division.
     * @throws ArithmeticException Si le dénominateur est égal à zéro.
     */
    public double valeur() {
        double denominateur = getOperande2().valeur();
        if (denominateur == 0) {
            throw new ArithmeticException("Division par zéro");
        }
        return getOperande1().valeur() / denominateur;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de 
     * l'opération de division.
     * 
     * @return La chaîne représentant la division.
     */
    public String toString() {
        return "(" + getOperande1() + " / " + getOperande2() + ")";
    }
}
