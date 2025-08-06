//1. Modele e implemente um método recursivo que recebe um inteiro zero ou positivo e retorna um String com o número em binário.
       //  String convBase2(int n) 



public class questao6 {
    public static String convBase2(int n) {
        if (n<2) {
            return Integer.toString(n);
        }
        return convBase2(n/2)+ Integer.toString(n%2);
    }
    }

    