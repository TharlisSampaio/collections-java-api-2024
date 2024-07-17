package main.java.list.OperacaosBasicas;

public class App {
    public static void main(String[] args) {
        //ListaTarefa lisataTarefa = new ListaTarefa();

        //System.out.println("O número toral de elementos na lista é: " + lisataTarefa.obterNumetoTotalTarefas());

        //lisataTarefa.adicionarTarefa("Tarefa 1");
        //lisataTarefa.adicionarTarefa("Tarefa 2");
        //lisataTarefa.adicionarTarefa("Tarefa 3");
        //lisataTarefa.adicionarTarefa("Tarefa 4");
        //lisataTarefa.adicionarTarefa("Tarefa 4");
        //lisataTarefa.adicionarTarefa("Tarefa 4");

        //System.out.println("O número toral de elementos na lista é: " + lisataTarefa.obterNumetoTotalTarefas());

        //lisataTarefa.removerTarefa("Tarefa 4");

        //System.out.println("O número toral de elementos na lista é: " + lisataTarefa.obterNumetoTotalTarefas());

        //lisataTarefa.obterDescricaoTarefas();

        CarinhoDeCompra carinhoDeCompra = new CarinhoDeCompra();

        carinhoDeCompra.adicionarItem("Caneta", 1.99, 6);

        System.out.println(carinhoDeCompra.calcularValorTotal());

        carinhoDeCompra.exibirIens();

        carinhoDeCompra.removerItem("caneta");

        carinhoDeCompra.exibirIens();
    }
}
