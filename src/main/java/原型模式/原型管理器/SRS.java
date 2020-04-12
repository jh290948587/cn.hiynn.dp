/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 原型模式.原型管理器;

//软件需求规格说明书(Software Requirements Specification)类
class SRS implements OfficialDocument
{
    public  OfficialDocument clone()
    {
        OfficialDocument  srs = null;
        try
        {
            srs  = (OfficialDocument)super.clone();
        }
        catch(CloneNotSupportedException  e)
        {
            System.out.println("不支持复制！");
        }
        return  srs;
    }

    public  void display()
    {
        System.out.println("《软件需求规格说明书》");
    }
}