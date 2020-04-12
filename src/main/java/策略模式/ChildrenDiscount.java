/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 策略模式;

//儿童票折扣类：具体策略类
class ChildrenDiscount implements Discount {
    public double calculate(double price) {
        System.out.println("儿童票：");
        return price - 10;
    }
}