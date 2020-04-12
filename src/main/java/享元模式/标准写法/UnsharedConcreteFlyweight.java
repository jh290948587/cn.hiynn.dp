/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 享元模式.标准写法;

//非享元角色
class UnsharedConcreteFlyweight
{
    private String info;
    UnsharedConcreteFlyweight(String info)
    {
        this.info=info;
    }
    public String getInfo()
    {
        return info;
    }
    public void setInfo(String info)
    {
        this.info=info;
    }
}