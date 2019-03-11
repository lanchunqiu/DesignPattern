package com.lancq.structure_pattern.composite.transparent;
//抽象组件
public interface Component {
    void add(Component c);
    void remove(Component c);
    Component getChild(int i);
    void operation();
}
