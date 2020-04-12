/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 观察者模式.手动实现;

public class Observer2 implements Observer
{
    private Subject subject ;

    public Observer2(Subject subject)
    {
        this.subject = subject  ;
        subject.registerObserver(this);
    }

    @Override
    public void update(String msg)
    {
        System.out.println("observer2 得到 3D 号码 -->" + msg + "我要告诉舍友们。");
    }



}
