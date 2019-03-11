package com.lancq.structure_pattern.composite.transparent;
//树叶组件
public class Leaf implements Component {
    private String name;
    public Leaf(String name)
    {
        this.name=name;
    }
    public void add(Component c){ }
    public void remove(Component c){ }
    public Component getChild(int i)
    {
        return null;
    }
    public void operation()
    {
        System.out.println("树叶"+name+"：被访问！");
    }
}
