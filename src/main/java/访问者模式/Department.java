/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 访问者模式;

//部门类：抽象访问者类
abstract class Department
{
    //声明一组重载的访问方法，用于访问不同类型的具体元素
    public abstract void visit(FulltimeEmployee employee);
    public abstract void visit(ParttimeEmployee employee);
}