package com.lancq.others_pattern.delegate.Army;

/**
 * @Author lancq
 * @Description 军人
 * @Date 2018/4/27
 **/
public interface Soldier {
    /**
     * 执行军令
     * @param command
     */
    public void executeCommand(String command);
}
