import java.util.ArrayList;

public class questao7 {

    public static int somatorio(ArrayList<Integer> lista) {
        return somatorioRecursivo(lista, 0);
    }

    private static int somatorioRecursivo(ArrayList<Integer> lista, int indice) {
        if (indice >= lista.size()) {
            return 0;
        }
      
        return lista.get(indice) + somatorioRecursivo(lista, indice + 1);
    }


    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println("Somatório: " + somatorio(numeros)); // Deve imprimir 15
    }
}