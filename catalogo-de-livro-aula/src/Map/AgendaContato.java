package Map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    
    Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
      }
    

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        agendaContatoMap.remove(nome);
    }
    
    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer telefonePorNome = null;
            telefonePorNome = agendaContatoMap.get(nome);
        return telefonePorNome;
    }

}
