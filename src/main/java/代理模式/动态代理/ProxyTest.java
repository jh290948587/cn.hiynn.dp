/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 代理模式.动态代理;

/**
 * 描述：
 *
 * @author maguokai
 * @date 2020/4/3 10:26
 * @modified By maguokai
 * @since
 */
//动态代理中，代理类并不是在AccessValidatorJava代码中实现，而是在运行时期生成，相比静态代理，动态代理可以很方便的对委托类的方法进行统一处理，
//如添加方法调用次数、添加日志功能等等，动态代理分为jdk动态代理和cglib动态代理，下面通过一个例子看看如何实现jdk动态代理。

public class ProxyTest {
    public static void main(String[] args) {
        Service service = new UserServiceImpl();
        MyInvocatioHandler handler = new MyInvocatioHandler(service);
        Service serviceProxy = (Service)handler.getProxy();
        serviceProxy.add();
    }
}