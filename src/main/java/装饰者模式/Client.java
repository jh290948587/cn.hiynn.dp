/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 装饰者模式;

/**
 * 描述：
 *
 * @author maguokai
 * @date 2020/4/3 9:30
 * @modified By maguokai
 * @since
 */
class Client
{
    public  static void main(String args[])
    {
        Component component,componentSB;  //使用抽象构件定义
        component = new Window(); //定义具体构件
        componentSB = new  ScrollBarDecorator(component); //定义装饰后的构件
        componentSB.display();
    }
}