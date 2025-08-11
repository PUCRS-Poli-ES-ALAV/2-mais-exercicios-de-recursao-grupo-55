//Implemente um metodo recursivo para determinar se um string ocorre dentro de outro.
//      boolean findSubStr(String str, String match)

public class questao9 {
    public static boolean findSubStr(String str, String match) {
        if (match.length() == 0) return true;
        if (str.length() < match.length()) return false;
        if (str.substring(0, match.length()).equals(match)) return true;
        return findSubStr(str.substring(1), match);
    }
}
