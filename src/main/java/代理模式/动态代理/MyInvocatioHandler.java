/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 描述：
 *
 * @author maguokai
 * @date 2020/4/3 10:26
 * @modified By maguokai
 * @since
 */
class MyInvocatioHandler implements InvocationHandler {
    private Object target;

    public MyInvocatioHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-----before-----");
        Object result = method.invoke(target, args);
        System.out.println("-----end-----");
        return result;
    }
    // 生成代理对象
    public Object getProxy() {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(loader, interfaces, this);
    }
}