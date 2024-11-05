/**
 * Classe abstraite représentant une opération entre deux expressions.
 * 
 * @author TonNoOuzia Tassadit
 * @version 2.0
 */
public abstract class Operation extends Expression {
    
    // Les deux opérandes
    private Expression operande1;
    private Expression operande2;

    /**
     * Constructeur de l'opération.
     * 
     * @param operande1 Premier opérande
     * @param operande2 Deuxième opérande
     */
    public Operation(Expression operande1, Expression operande2) {
        this.operande1 = operande1;
        this.operande2 = operande2;
    }

    /**
     * Retourne le premier opérande.
     * 
     * @return Premier opérande
     */
    public Expression getOperande1() {
        return operande1;
    }

    /**
     * Retourne le deuxième opérande.
     * 
     * @return Deuxième opérande
     */
    public Expression getOperande2() {
        return operande2;
    }

    /**
     * Méthode abstraite pour calculer la valeur de l'opération.
     * 
     * @return La valeur de l'opération
     */
    public abstract double valeur();
}
