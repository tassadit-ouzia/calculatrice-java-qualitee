/**
 * Classe de test pour les opérations arithmétiques.
 * Permet de créer des expressions et de tester leur évaluation.
 * 
 * @author TonNom
 * @version 1.0
 */
public class TestOperation {

    /**
     * Méthode principale pour tester les opérations arithmétiques.
     * Affiche le résultat de l'expression (17 - 2) / (2 + 3).
     * 
     * @param args Arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {
        // Création des expressions pour l'opération (17-2) / (2+3)
        Expression d = new Division(new Soustraction(new Nombre(17), new Nombre(2)),
                                    new Addition(new Nombre(2), new Nombre(3)));
        
        // Affichage du résultat
        System.out.println(d + " = " + d.valeur()); // Affiche ((17 - 2) / (2 + 3)) = 3.0
    }

    /**
     * Crée une expression à partir d'une chaîne de caractères.
     * 
     * @param e L'expression sous forme de chaîne.
     * @return L'expression correspondante sous forme d'objet.
     * @throws IllegalArgumentException Si l'expression est invalide.
     */
    public static Expression fabriqueExpression(String e) {
        e = e.trim();
        
        // Si l'expression est un nombre
        if (e.matches("\\d+(\\.\\d+)?")) {
            return new Nombre(Double.parseDouble(e));
        }

        // Recherche de l'opération principale
        int openParentheses = 0;
        for (int i = 0; i < e.length(); i++) {
            char c = e.charAt(i);
            if (c == '(') openParentheses++;
            else if (c == ')') openParentheses--;
            else if ((c == '+' || c == '-' || c == '*' || c == '/') && openParentheses == 0) {
                Expression left = fabriqueExpression(e.substring(0, i));
                Expression right = fabriqueExpression(e.substring(i + 1));
                switch (c) {
                    case '+': return new Addition(left, right);
                    case '-': return new Soustraction(left, right);
                    case '*': return new Multiplication(left, right);
                    case '/': return new Division(left, right);
                }
            }
        }

        // Enlever les parenthèses si l'expression est entourée
        if (e.startsWith("(") && e.endsWith(")")) {
            return fabriqueExpression(e.substring(1, e.length() - 1));
        }

        throw new IllegalArgumentException("Expression invalide : " + e);
    }
}
