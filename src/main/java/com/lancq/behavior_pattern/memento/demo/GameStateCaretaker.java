package com.lancq.behavior_pattern.memento.demo;

/**
 * 存档管理者
 */
public class GameStateCaretaker {
    private GameState gameState;

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public GameState getGameState() {
        return gameState;
    }
}
