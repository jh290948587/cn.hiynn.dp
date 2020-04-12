/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 装饰者模式;

//构件装饰类：抽象装饰类
class ComponentDecorator extends Component
{
    private Component component;  //维持对抽象构件类型对象的引用

    public ComponentDecorator(Component  component)  //注入抽象构件类型的对象
    {
        this.component = component;
    }

    public void display()
    {
        component.display();
    }
}