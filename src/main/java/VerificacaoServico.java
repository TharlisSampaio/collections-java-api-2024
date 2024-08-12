package main.java;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        List listaServicos = Arrays.asList(partes);
        String nomeCliente = partes[0];
        boolean contratado = false;
        contratado = listaServicos.contains(servico.toLowerCase());

        // TODO: Verifique se o serviço está na lista de serviços contratados
        if(contratado){
            System.out.println("Sim");
        }else{
            System.out.println("Nao");
        }

        scanner.close();
    }
}