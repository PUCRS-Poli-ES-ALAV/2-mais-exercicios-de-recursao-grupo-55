// Modele e implemente um metodo recursivo para encontrar o maior elemento de um ArrayList.
//     int findBiggest(ArrayList<Integer> ar)

import java.util.ArrayList;

public class questao8 {
    public static int findBiggest(ArrayList<Integer> array){
        if (array.size() == 1) {
            return array.get(0);
        }
        int first = array.get(0);
        array.remove(0);
        int biggestRest = findBiggest(array);
        return Math.max(first, biggestRest);
    }
    }

