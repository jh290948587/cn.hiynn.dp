/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 简单工厂;

//柱状图类：具体产品类
class HistogramChart implements Chart {
    public HistogramChart() {
        System.out.println("创建柱状图！");
    }

    public void display() {
        System.out.println("显示柱状图！");
    }
}