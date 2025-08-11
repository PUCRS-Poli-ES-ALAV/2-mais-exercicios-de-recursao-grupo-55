import java.util.ArrayList;

public class questao11 {
    public static ArrayList<String> permutations(String s) {
        ArrayList<String> result = new ArrayList<>();
        permute("", s, result);
        return result;
    }

    private static void permute(String prefix, String remaining, ArrayList<String> result) {
        if (remaining.length() == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                permute(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1),
                        result);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> perms = permutations("ABC");
        System.out.println(perms);
    }
}