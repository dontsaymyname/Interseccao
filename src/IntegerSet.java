import java.util.ArrayList;
import java.util.List;

public class IntegerSet {

    private List<Integer> numeros = new ArrayList<>();

    public void uniao (List<Integer> umConjunto){
        for (Integer elementosOutroConjunto : umConjunto) {
            numeros.add(elementosOutroConjunto);

        }


    }
    public void interseccao (List<Integer> umConjunto){
        for (Integer elementosOutroConjunto : umConjunto){
            if (numeros.contains(elementosOutroConjunto)){
                numeros.add(elementosOutroConjunto);
            }
        }
    }
    public void diferenca (List<Integer> umConjunto){
        for (Integer elementosOutroConjunto : umConjunto){
            if (umConjunto != numeros){
                numeros.add(elementosOutroConjunto);
            }
        }
    }

    public void popularLista(){
        numeros.add(3);
        numeros.add(4);
    }


}
