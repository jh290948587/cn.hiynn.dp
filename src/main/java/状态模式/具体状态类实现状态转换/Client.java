/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 状态模式.具体状态类实现状态转换;

class Client {
    public static void main(String args[]) {
        Account acc = new Account("段誉",0.0);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.deposit(3000);
        acc.withdraw(4000);
        acc.withdraw(1000);
        acc.computeInterest();
    }
}