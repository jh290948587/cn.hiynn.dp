/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 抽象工厂;

//Spring文本框类：具体产品
class SpringTextField implements TextField {
    public void display() {
        System.out.println("显示绿色边框文本框。");
    }
}