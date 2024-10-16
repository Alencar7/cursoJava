package generics;

import java.util.*;

public class Pares<C extends Number, V> {
    //Set nao aceita repeticao
    private final Set<Par<C, V>> itens = new LinkedHashSet<>();

    public void adicionar(C chave, V valor){
        if(chave == null) return; //sai do metodo, nao executa nennhuma outra linha

        Par<C, V> novoPar = new Par<>(chave, valor);

        if (itens.contains(novoPar)){
            itens.remove(novoPar);// remover o valor contido
        }

        itens.add(novoPar);
    }

    public V getValor(C chave) {
        if (chave == null) return null;

        Optional<Par<C, V>> parOptional = itens.stream()
                .filter(par -> chave.equals(par.getChave())) //comparar apenas a chava, +inteligente
                .findFirst();

        return parOptional.isPresent()
                ? parOptional.get().getValor() : null;
    }


}
