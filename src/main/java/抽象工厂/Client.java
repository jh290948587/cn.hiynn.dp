/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 抽象工厂;

/**
 * 描述：
 *
 * @author maguokai
 * @date 2020/4/6 15:00
 * @modified By maguokai
 * @since
 */
class Client {
    public static void main(String args[]) {
        //使用抽象层定义
        SkinFactory factory;
        Button bt;
        TextField tf;
        ComboBox cb;
        factory = (SkinFactory)XMLUtil.getBean();
        bt = factory.createButton();
        tf = factory.createTextField();
        cb = factory.createComboBox();
        bt.display();
        tf.display();
        cb.display();
    }
}