package main.java.list.OperacaosBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarinhoDeCompra {
    private List<Item> listaItens;

    public CarinhoDeCompra(){
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> listaItensParaRemover = new ArrayList<>();
        for(Item item: listaItens){
            if(item.getNome().equalsIgnoreCase(nome)){
                listaItensParaRemover.add(item);
            }
        }
        listaItens.removeAll(listaItensParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0.0;
        for(Item item: listaItens){
            valorTotal =+ item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirIens(){
        System.out.println(this.listaItens);
    }
}
