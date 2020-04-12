/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 策略模式;

//折扣类：抽象策略类
interface Discount {
    public double calculate(double price);
}