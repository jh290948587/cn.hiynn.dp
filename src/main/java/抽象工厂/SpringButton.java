/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 抽象工厂;

//Spring按钮类：具体产品
class SpringButton implements Button {
    public void display() {
        System.out.println("显示浅绿色按钮。");
    }
}