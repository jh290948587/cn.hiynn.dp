/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 状态模式.环境类实现状态转换;

//正常状态类
class NormalState extends State{
    public void display() {
        System.out.println("正常大小！");
    }
}