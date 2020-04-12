/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 代理模式.静态代理;

class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }
    public void request(){
        System.out.println("begin");
        subject.request();
        System.out.println("end");
    }
}