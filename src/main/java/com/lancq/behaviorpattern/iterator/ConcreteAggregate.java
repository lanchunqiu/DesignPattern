package com.lancq.behaviorpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合角色
 *
 * @author lancq
 */
public class ConcreteAggregate implements Aggregate {
    private List<Object> items = new ArrayList();

    @Override
    public void add(Object obj) {
        items.add(obj);
    }

    @Override
    public void remove(Object obj) {
        items.remove(obj);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public List<Object> getItems() {
        return items;
    }
}
