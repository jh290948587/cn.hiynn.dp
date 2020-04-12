/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 代理模式.静态代理;

/**
 * 描述：
 *
 * @author maguokai
 * @date 2020/4/3 10:23
 * @modified By maguokai
 * @since
 */
class RealSubject implements Subject {
    public void request(){
        System.out.println("RealSubject");
    }
}