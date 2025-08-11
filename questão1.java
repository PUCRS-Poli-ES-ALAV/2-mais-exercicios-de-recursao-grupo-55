//1. Modele e implemente um metodo recursivo que recebe um String em retorna true se este String for um palíndrome, false caso contrário.
        // boolean isPal(String s) 
public class questão1 {

    public static boolean isPal(String s) {
        s = s.replaceAll("\\s+", "").toLowerCase();
        
        return isPalRecursive(s, 0, s.length() - 1);
    }

    private static boolean isPalRecursive(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        
        return isPalRecursive(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        System.out.println(isPal("Subi no onibus")); // true
        System.out.println(isPal("Quiero Cafe")); // false
    }
}