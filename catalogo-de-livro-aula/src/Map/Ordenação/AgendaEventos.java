package Map.Ordenação;

import java.util.Map;
import java.time.LocalDate;
import java.util.HashMap;

public class AgendaEventos {

    Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();

    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        System.out.println(eventosMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
          LocalDate dataEvento = entry.getKey();
          if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
            proximaData = dataEvento;
            proximoEvento = entry.getValue();
            break;
          }
        }
        if (proximoEvento != null) {
          System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
        } else {
          System.out.println("Não há eventos futuros na agenda.");
        }
      }
}