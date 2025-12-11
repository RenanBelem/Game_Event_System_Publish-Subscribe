/*
  Consumidor 2: Sistema de Notificação. Reage a todos os eventos.
 */
class SistemaNotificacao implements ConsumidorEventosJogo {

    @Override
    public void atualizar(String tipoEvento, String mensagem) {
        // notifica o jogador para todos os tipos de evento
        System.out.println("  [🔔 Notificação] Alerta para o jogador: " + tipoEvento + " - " + mensagem);
    }
}