/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 代理模式.cglib动态代理;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//2.生成代理
public class CGLibProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();
    public Object getProxy(Class<?> clazz){
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }
    /**
     * 拦截所有目标类方法的调用
     * 参数：
     * obj  目标实例对象
     * method 目标方法的反射对象
     * args 方法的参数
     * proxy 代理类的实例
     */
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {
        //代理类调用父类的方法
        System.out.println("日志开始");
        proxy.invokeSuper(obj, args);
        System.out.println("日志结束");
        return null;
    }
}
