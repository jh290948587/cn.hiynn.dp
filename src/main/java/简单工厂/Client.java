/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 简单工厂;

class Client {
    public static void main(String args[]) {
        Chart chart;
        chart = ChartFactory.getChart("histogram"); //通过静态工厂方法创建产品
        chart.display();
    }
}