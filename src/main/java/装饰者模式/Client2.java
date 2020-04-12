/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 装饰者模式;

/**
 * 描述：
 *
 * @author maguokai
 * @date 2020/4/3 9:31
 * @modified By maguokai
 * @since
 */
class Client2
{
    public  static void main(String args[])
    {
        Component  component,componentSB,componentBB; //全部使用抽象构件定义
        component = new Window();
        componentSB = new  ScrollBarDecorator(component);
        componentBB = new  BlackBorderDecorator(componentSB); //将装饰了一次之后的对象继续注入到另一个装饰类中，进行第二次装饰
        componentBB.display();
    }
}