import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        List<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);

        IntegerSet integerSet = new IntegerSet();
        integerSet.popularLista();

        resultado = integerSet.uniao(lista1);



    }
}
