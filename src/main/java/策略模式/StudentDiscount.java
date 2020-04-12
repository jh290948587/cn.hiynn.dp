/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 策略模式;

//学生票折扣类：具体策略类
class StudentDiscount implements Discount {
    public double calculate(double price) {
        System.out.println("学生票：");
        return price * 0.8;
    }
}