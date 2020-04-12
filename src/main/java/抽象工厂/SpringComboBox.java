/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 抽象工厂;

//Spring组合框类：具体产品
class SpringComboBox implements ComboBox {
    public void display() {
        System.out.println("显示绿色边框组合框。");
    }
}