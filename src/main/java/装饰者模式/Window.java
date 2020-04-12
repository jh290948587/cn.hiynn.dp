/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 装饰者模式;

//窗体类：具体构件类
class Window extends Component
{
    public  void display()
    {
        System.out.println("显示窗体！");
    }
}