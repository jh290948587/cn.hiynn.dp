/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 装饰者模式;

//文本框类：具体构件类
class TextBox extends Component
{
    public  void display()
    {
        System.out.println("显示文本框！");
    }
}