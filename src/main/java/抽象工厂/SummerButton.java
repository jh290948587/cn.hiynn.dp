/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 抽象工厂;

//Summer按钮类：具体产品
class SummerButton implements Button {
    public void display() {
        System.out.println("显示浅蓝色按钮。");
    }
}