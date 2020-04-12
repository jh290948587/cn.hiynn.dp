/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 享元模式.标准写法;

//具体享元角色
class ConcreteFlyweight implements Flyweight
{
    private String key;
    ConcreteFlyweight(String key)
    {
        this.key=key;
        System.out.println("具体享元"+key+"被创建！");
    }
    public void operation(UnsharedConcreteFlyweight outState)
    {
        System.out.print("具体享元"+key+"被调用，");
        System.out.println("非享元信息是:"+outState.getInfo());
    }
}