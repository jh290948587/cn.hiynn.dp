/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 桥接模式;

//抽象图像类：抽象类
abstract class Image {
    protected ImageImp imp;

    public void setImageImp(ImageImp imp) {
        this.imp = imp;
    }

    public abstract void parseFile(String fileName);
}