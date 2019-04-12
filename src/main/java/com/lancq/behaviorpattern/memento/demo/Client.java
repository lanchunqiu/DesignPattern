package com.lancq.behaviorpattern.memento.demo;

public class Client {
    public static void main(String[] args) {
        //游戏初始状态
        GameRole  first = new GameRole();
        first.initial();
        System.out.print("做任务之前，");
        first.showState();

        System.out.println("====================");

        //进度保存
        GameStateCaretaker gameStateCaretaker = new GameStateCaretaker();
        gameStateCaretaker.setGameState(first.saveState());

        //做任务失败
        first.doTaskFail();
        System.out.print("做任务失败后，");
        first.showState();

        System.out.println("====================");

        //恢复存档
        first.recover(gameStateCaretaker.getGameState());
        System.out.print("恢复存档后，");
        first.showState();

    }
}
