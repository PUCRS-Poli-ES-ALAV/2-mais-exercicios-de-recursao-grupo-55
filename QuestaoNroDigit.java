public class QuestaoNroDigit {
    public static int nroDigit(int n) {
        if (n >= 0 && n < 10) {
            return 1;
        }
        return 1 + nroDigit(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(nroDigit(7));      // 1
        System.out.println(nroDigit(123));    // 3
        System.out.println(nroDigit(2025));   // 4
    }
}