/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 抽象工厂;

//Summer组合框类：具体产品
class SummerComboBox implements ComboBox {
    public void display() {
        System.out.println("显示蓝色边框组合框。");
    }
}