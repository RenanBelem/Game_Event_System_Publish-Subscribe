/*
  Consumidor 1: Exibe estatiticas do jogador e reage a eventos especificos.
 */
class EstatisticasJogador implements ConsumidorEventosJogo {
    private String nomeJogador;

    public EstatisticasJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    @Override
    public void atualizar(String tipoEvento, String mensagem) {
        if (tipoEvento.equals("LevelUp")) {
            System.out.println("  [📊 Estatísticas] " + nomeJogador + " subiu de nível! " + mensagem);
        } else if (tipoEvento.equals("Conquista Desbloqueada!")) {
            System.out.println("  [🏆 Estatísticas] Conquista de " + nomeJogador + " registrada: " + mensagem);
        }
    }
}