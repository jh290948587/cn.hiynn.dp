/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 简单工厂;

//饼状图类：具体产品类
class PieChart implements Chart {
    public PieChart() {
        System.out.println("创建饼状图！");
    }

    public void display() {
        System.out.println("显示饼状图！");
    }
}