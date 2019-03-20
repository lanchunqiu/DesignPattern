package com.lancq.behavior_pattern.memento.demo;

/**
 * 游戏状态（备忘录角色）
 */
public class GameState {
    public GameState(int level, int coordinate, int chapter, int HP, int MP) {
        this.level = level;
        this.coordinate = coordinate;
        this.chapter = chapter;
        this.HP = HP;
        this.MP = MP;
    }

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(int coordinate) {
        this.coordinate = coordinate;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }
}
