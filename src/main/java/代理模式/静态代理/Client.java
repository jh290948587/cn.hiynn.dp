/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 代理模式.静态代理;

/**
 * 描述：
 *
 * @author maguokai
 * @date 2020/4/3 10:24
 * @modified By maguokai
 * @since
 */
public class Client {
    public static void main(String args[]) {
        RealSubject subject = new RealSubject();
        Proxy p = new Proxy(subject);
        p.request();
    }
}