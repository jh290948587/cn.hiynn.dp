/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 代理模式.cglib动态代理;


//3.测试
public class Test {
    public static void main(String[] args) {
        CGLibProxy proxy = new CGLibProxy();
        Train t = (Train) proxy.getProxy(Train.class);
        t.move();
    }
}
