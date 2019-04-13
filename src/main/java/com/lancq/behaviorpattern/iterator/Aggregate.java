package com.lancq.behaviorpattern.iterator;

/**
 * 抽象聚合角色
 *
 * @author lancq
 */
public interface Aggregate {
    void add(Object obj);

    void remove(Object obj);

    Iterator createIterator();
}
