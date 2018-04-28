package com.lancq.structure_pattern.decorator;

/**
 * @Author lancq
 * @Description 装饰器类
 * @Date 2018/4/28
 **/
public class Decorator extends Component{
    protected Component component;

    public void setComponent(Component component) {
        this.component = component;
    }

    //重写基本操作方法
    @Override
    public void operation() {
        if(component != null){
            component.operation();
        }
    }
}
