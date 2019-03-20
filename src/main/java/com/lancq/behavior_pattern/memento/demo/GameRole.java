package com.lancq.behavior_pattern.memento.demo;

/**
 * 游戏角色（发起人角色）
 */
public class GameRole {

    /**
     * 角色等级
     */
    private int level;

    /**
     * 角色的地图坐标
     */
    private int coordinate;

    /**
     * 章节进度
     */
    private int chapter;

    /**
     * 生命值
     */
    private int HP;

    /**
     * 魔力值
     */
    private int MP;

    /**
     * 保存游戏状态
     * @return
     */
    public GameState saveState(){
        return new GameState(level, coordinate, chapter, HP, MP);
    }

    /**
     * 恢复存档
     * @param gameState
     */
    public void recover(GameState gameState){
        this.level = gameState.getLevel();
        this.coordinate = gameState.getCoordinate();
        this.chapter = gameState.getChapter();
        this.HP = gameState.getHP();
        this.MP = gameState.getMP();
    }

    /**
     * 显示游戏状态
     */
    public void showState(){
        System.out.println("游戏进度信息如下：");
        System.out.println("角色级别：" + this.level);
        System.out.println("角色坐标：" + this.coordinate);
        System.out.println("角色生命值：" + this.HP);
        System.out.println("角色魔力值：" + this.MP);
        System.out.println("游戏章节：" + this.chapter + "章节");
    }

    /**
     * 初始化
     */
    public void initial(){
        this.level = 100;
        this.coordinate = 1234;
        this.chapter = 10;
        this.HP = 1000;
        this.MP = 999;
    }

    /**
     * 做任务失败
     */
    public void doTaskFail(){
        this.level = 100;
        this.coordinate = 1234;
        this.chapter = 10;
        this.HP = 0;
        this.MP = 0;
    }

}
