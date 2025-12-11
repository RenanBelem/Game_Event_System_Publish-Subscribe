# Sistema de Eventos de Jogo (Observer Pattern)

Este projeto é uma implementação simples e didática de um sistema de notificações para jogos utilizando a linguagem Java. O objetivo é demonstrar como desacoplar a lógica de geração de eventos (como subir de nível ou desbloquear conquistas) da lógica de reação a esses eventos (como atualizar a UI ou logs).

## 🏛️ Padrão de Projeto Utilizado

O projeto implementa o **Padrão Observer** (também conhecido como *Publish-Subscribe*).

  * **Produtor (Subject):** Mantém uma lista de dependentes (consumidores) e os notifica automaticamente de qualquer mudança de estado ou evento.
  * **Consumidor (Observer):** Define uma interface de atualização para objetos que devem ser notificados sobre mudanças no Produtor.

## 📂 Estrutura do Projeto

O código é dividido nas seguintes classes e interfaces:

  * **`Main.java`**: A classe principal que orquestra a execução. Ela instancia o produtor, cria os consumidores, realiza as inscrições (subscrições) e dispara eventos de simulação.
  * **`ProdutorEventosJogo.java`**: Gerencia a lista de consumidores inscritos. Possui métodos para:
      * `inscreve()`: Adicionar um ouvinte.
      * `desinscreve()`: Remover um ouvinte.
      * `notificaConsumidores()`: Disparar eventos para todos os ouvintes ativos.
  * **`ConsumidorEventosJogo.java` (Interface)**: Define o contrato que todos os observadores devem seguir (o método `atualizar`).
  * **`SistemaNotificacao.java`**: Um consumidor concreto que reage a **todos** os eventos, gerando um log de alerta genérico.
  * **`EstatisticasJogador.java`**: Um consumidor concreto focado em lógica específica. Ele filtra os eventos e só reage a "LevelUp" ou conquistas, ignorando outros tipos de mensagens.

## 🚀 Como Executar

Certifique-se de ter o [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/downloads/) instalado.

1.  **Compile os arquivos:**
    Abra o terminal na pasta onde os arquivos estão salvos e execute:

    ```bash
    javac *.java
    ```

2.  **Execute o programa:**
    Após a compilação, execute a classe principal:

    ```bash
    java Main
    ```

## 📋 Exemplo de Saída

Ao rodar o projeto, o console exibirá o fluxo de inscrições, notificações e desinscrições conforme abaixo:

```text
--- FASE DE INSCRIÇÃO ---
LOG: Novo componente inscrito.
LOG: Novo componente inscrito.
-------------------------

Simulando que o jogador ganhou XP e subiu de nível:

--- NOVO EVENTO: LevelUp ---
  [📊 Estatísticas] Herói X subiu de nível! O jogador atingiu o Nível 10!
  [🔔 Notificação] Alerta para o jogador: LevelUp - O jogador atingiu o Nível 10!

Simulando que o jogador desbloqueou uma conquista:

--- NOVO EVENTO: Conquista Desbloqueada ---
  [🔔 Notificação] Alerta para o jogador: Conquista Desbloqueada - Assassino de Goblins!

--- FASE DE DESINSCRIÇÃO ---
LOG: Componente desinscrito.
----------------------------

Simulando que o jogador encontrou um novo item raro:

--- NOVO EVENTO: Novo Item Encontrado ---
```

> **Nota:** No último evento ("Novo Item Encontrado"), o `SistemaNotificacao` já foi removido e o `EstatisticasJogador` não possui lógica para reagir a este tipo específico de evento, por isso nenhuma mensagem interna dos consumidores é impressa, demonstrando a flexibilidade do sistema.

## 🛠️ Tecnologias

  * Java (Core)
  * Programação Orientada a Objetos (POO)

-----
