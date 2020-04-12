/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 原型模式.原型管理器;

import java.util.*;

//抽象公文接口，也可定义为抽象类，提供clone()方法的实现，将业务方法声明为抽象方法
interface OfficialDocument extends  Cloneable
{
    public  OfficialDocument clone();
    public  void display();
}

//可行性分析报告(Feasibility Analysis Report)类
class FAR implements OfficialDocument
{
    public  OfficialDocument clone()
    {
        OfficialDocument  far = null;
        try
        {
            far  = (OfficialDocument)super.clone();
        }
        catch(CloneNotSupportedException  e)
        {
            System.out.println("不支持复制！");
        }
        return  far;
    }

    public  void display()
    {
        System.out.println("《可行性分析报告》");
    }
}