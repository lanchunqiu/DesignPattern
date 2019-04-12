package com.lancq.behaviorpattern.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 对象结构类
 * @author lancq
 */
public class ObjectStructure {
    private List<Element> list = new ArrayList<Element>();

    public void accept(Visitor visitor)
    {
        Iterator<Element> i=list.iterator();
        while(i.hasNext())
        {
            Element element = i.next();
            element.accept(visitor);
        }
    }
    public void add(Element element)
    {
        list.add(element);
    }
    public void remove(Element element)
    {
        list.remove(element);
    }
}
