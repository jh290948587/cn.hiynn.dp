/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 桥接模式;

//抽象操作系统实现类：实现类接口
interface ImageImp {
    public void doPaint(Matrix m);  //显示像素矩阵m
}