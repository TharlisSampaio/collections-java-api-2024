package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvide){
        this.convidadoSet.add(new Convidado(nome, codigoConvide));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvide){
        Convidado convidadoParaRemover = null;
        for(Convidado convidado: convidadoSet){
            if(convidado.getCodigoConvide() == codigoConvide){
                convidadoParaRemover = convidado;
                break;
            }
        }
        this.convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return this.convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(this.convidadoSet);
    }
}
