/*
  A interface Consumidor para receber notificacoes de eventos.
 */
interface ConsumidorEventosJogo {
    void atualizar(String tipoEvento, String mensagem);
}