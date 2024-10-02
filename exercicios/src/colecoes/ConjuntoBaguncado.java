package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    @SuppressWarnings({"raytypes", "unchecked"})
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); //double -> Double(classe)
        conjunto.add(true); //boolean -> Boolean
        conjunto.add("Teste"); //String
        conjunto.add(1); //int -> Interger
        conjunto.add('x'); // char -> Caractere

        System.out.println("Tamanho e: " + conjunto.size());

        conjunto.add("teste"); //add +1 conjunto
        System.out.println("Tamanho e: " + conjunto.size());

        System.out.println(conjunto.remove("teste"));// remover - true or false

        System.out.println("Tamanho e: " + conjunto.size());

        System.out.println(conjunto.contains('x')); // contem - true or false
        System.out.println(conjunto.contains(1));
        System.out.println(conjunto.contains(true));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //UNIAO ENTRE CONJUTOS => conjunto.addAll(nums);
        conjunto.retainAll(nums); // INTERSECAO (ponto em comum dos 2)
        System.out.println(conjunto);

        conjunto.clear(); //limpar
        System.out.println(conjunto);
    }

}
