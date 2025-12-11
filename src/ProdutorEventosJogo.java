import java.util.ArrayList;
import java.util.List;

/*
  A classe Produtor que gerencia os consumidores e notifica sobre novos eventos de jogo.
 */
class ProdutorEventosJogo {
    private List<ConsumidorEventosJogo> consumidores = new ArrayList<>();

    // 1. Método para adicionar um novo subscriber
    public void inscreve(ConsumidorEventosJogo consumidor) {
        consumidores.add(consumidor);
        System.out.println("LOG: Novo componente inscrito.");
    }

    // 2. Método para remover um subscriber 
    public void desinscreve(ConsumidorEventosJogo consumidor) {
        consumidores.remove(consumidor);
        System.out.println("LOG: Componente desinscrito.");
    }

    // 3. Metodo para notificar todos os consumidores
    public void notificaConsumidores(String tipoEvento, String mensagem) {
        System.out.println("\n--- NOVO EVENTO: " + tipoEvento + " ---");
        for (ConsumidorEventosJogo consumidor : consumidores) {
            consumidor.atualizar(tipoEvento, mensagem);
        }
    }
}