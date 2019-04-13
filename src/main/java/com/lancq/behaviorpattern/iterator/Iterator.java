package com.lancq.behaviorpattern.iterator;

/**
 * 抽象迭代器角色
 *
 * @author lancq
 */
public interface Iterator {
    Object first();

    Object next();

    boolean hasNext();
}
