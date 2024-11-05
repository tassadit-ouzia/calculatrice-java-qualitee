/**
 * Classe abstraite représentant une expression.
 * Les sous-classes doivent implémenter la méthode {@link #valeur()}.
 * 
 * @author Ouzia Tassadit
 * @version 2.0
 */
public abstract class Expression {

    /**
     * Méthode abstraite pour obtenir la valeur de l'expression.
     * 
     * @return La valeur de l'expression.
     */
    public abstract int valeur();
}
