/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 状态模式.具体状态类实现状态转换;

//抽象状态类
abstract class AccountState {
    protected Account acc;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterest();
    public abstract void stateCheck();
}