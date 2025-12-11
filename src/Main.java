public class Main {
    public static void main(String[] args) {
        // 1. Inicializa o Produtor
        ProdutorEventosJogo eventManager = new ProdutorEventosJogo();

        // 2. Cria os Consumidores 
        ConsumidorEventosJogo mostrarEstatisticas = new EstatisticasJogador("Herói X");
        ConsumidorEventosJogo SistemaNotificacao = new SistemaNotificacao();

        // 3. Consumidores se inscrevem no Produtor
        System.out.println("\n--- FASE DE INSCRIÇÃO ---");
        eventManager.inscreve(mostrarEstatisticas);
        eventManager.inscreve(SistemaNotificacao);
        System.out.println("-------------------------\n");

        // 4. Produtores dispara o primeiro evento (Level Up)
        System.out.println("Simulando que o jogador ganhou XP e subiu de nível:");
        eventManager.notificaConsumidores("LevelUp", "O jogador atingiu o Nível 10!");

        // 5. Produtor dispara o segundo evento (Conquista)
        System.out.println("\nSimulando que o jogador desbloqueou uma conquista:");
        eventManager.notificaConsumidores("Conquista Desbloqueada", "Assassino de Goblins!");

        // 6. Um componente se desinscreve
        System.out.println("\n--- FASE DE DESINSCRIÇÃO ---");
        eventManager.desinscreve(SistemaNotificacao);
        System.out.println("----------------------------\n");
        
        // 7. Produtor dispara o terceiro evento (Novo Item)
        // Apenas o EstatisticasJogador receberá este evento agora
        System.out.println("Simulando que o jogador encontrou um novo item raro:");
        eventManager.notificaConsumidores("Novo Item Encontrado", "Espada Lendária adquirida.");
    }
}