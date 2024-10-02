package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nomeCliente;
    List<Compra> compras = new ArrayList<>();

    public Cliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    //adicionarCompra - fica no cliente pq chama ele = clienteX.adicionarCompra();
    void adicionarCompra(Compra compra){
        this.compras.add(compra);
    }

    double obterValor(){
        double total = 0;

        for(Compra compraAtual: compras){
            total += compraAtual.obterValorTotal();
        }
        return total;
    }

}
