package com.lancq.behaviorpattern.iterator;

/**
 * 具体迭代器角色
 *
 * @author lancq
 */
public class ConcreteIterator implements Iterator {
    private ConcreteAggregate aggregate;

    private int index = 0;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.aggregate = concreteAggregate;
    }

    @Override
    public Object first() {
        return aggregate.getItems().get(0);
    }

    @Override
    public Object next() {
        Object obj = null;
        if (index < this.aggregate.getItems().size()) {
            obj = this.aggregate.getItems().get(index++);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        return index < this.aggregate.getItems().size();
    }
}
