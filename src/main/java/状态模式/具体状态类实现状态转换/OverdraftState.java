/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 状态模式.具体状态类实现状态转换;

//透支状态：具体状态类
class OverdraftState extends AccountState
{
    public OverdraftState(AccountState state) {
        this.acc = state.acc;
    }

    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
    }

    public void withdraw(double amount) {
        acc.setBalance(acc.getBalance() - amount);
        stateCheck();
    }

    public void computeInterest() {
        System.out.println("计算利息！");
    }

    //状态转换
    public void stateCheck() {
        if (acc.getBalance() > 0) {
            acc.setState(new NormalState(this));
        }
        else if (acc.getBalance() == -2000) {
            acc.setState(new RestrictedState(this));
        }
        else if (acc.getBalance() < -2000) {
            System.out.println("操作受限！");
        }
    }
}