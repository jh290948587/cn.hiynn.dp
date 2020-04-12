/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 迭代器模式;

import java.util.List;

//商品数据类：具体聚合类
class ProductList extends AbstractObjectList {
    public ProductList(List products) {
        super(products);
    }

    //实现创建迭代器对象的具体工厂方法
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}