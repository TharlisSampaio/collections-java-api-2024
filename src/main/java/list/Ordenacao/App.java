package main.java.list.Ordenacao;

public class App {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.79);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 24, 1.59);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 22, 1.69);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 26, 1.79);
        ordenacaoPessoa.adicionarPessoa("Nome 5", 23, 1.89);
        ordenacaoPessoa.adicionarPessoa("Nome 6", 37, 1.80);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
