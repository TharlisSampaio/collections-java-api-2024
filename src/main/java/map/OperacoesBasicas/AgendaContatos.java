package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //Atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        this.agendaContatoMap.put(nome,telefone);
    }

    public void removerContato(String nome){
        if(!this.agendaContatoMap.isEmpty()){
            this.agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(this.agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!this.agendaContatoMap.isEmpty()){
            numeroPorNome = this.agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }
}
