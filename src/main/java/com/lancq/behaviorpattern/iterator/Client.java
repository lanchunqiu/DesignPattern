package com.lancq.behaviorpattern.iterator;

import java.util.Random;

/**
 * 客户端
 *
 * @author lancq
 */
public class Client {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        for (int i = 0; i < 10; i++) {
            aggregate.add("【" + (i + 1) + "】号求职者" );
        }

        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println("请" + iterator.next() + "到第" + (new Random().nextInt(5) + 1) + "会议室参加面试！");
        }
    }
}
