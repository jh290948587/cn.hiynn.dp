/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 策略模式;

//VIP会员票折扣类：具体策略类
class VIPDiscount implements Discount {
    public double calculate(double price) {
        System.out.println("VIP票：");
        System.out.println("增加积分！");
        return price * 0.5;
    }
}