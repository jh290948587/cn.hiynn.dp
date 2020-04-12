package 享元模式.标准写法;

//抽象享元角色
interface Flyweight
{
    public void operation(UnsharedConcreteFlyweight state);
}
