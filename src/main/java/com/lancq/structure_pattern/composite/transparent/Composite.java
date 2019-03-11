package com.lancq.structure_pattern.composite.transparent;

import java.util.ArrayList;
import java.util.List;

//树枝组件
public class Composite implements Component {
    private List<Component> children=new ArrayList<Component>();

    public void add(Component c)
    {
        children.add(c);
    }
    public void remove(Component c)
    {
        children.remove(c);
    }
    public Component getChild(int i)
    {
        return children.get(i);
    }
    public void operation()
    {
        for(Object obj:children)
        {
            ((Component)obj).operation();
        }
    }
}
