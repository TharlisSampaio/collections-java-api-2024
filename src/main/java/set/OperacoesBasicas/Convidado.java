package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {
    //atributos
    private String nome;
    private int codigoConvide;

    public Convidado(String nome, int codigoConvide){
        this.nome = nome;
        this.codigoConvide = codigoConvide;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvide() {
        return codigoConvide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return getCodigoConvide() == convidado.getCodigoConvide();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoConvide());
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvide=" + codigoConvide +
                '}';
    }
}
