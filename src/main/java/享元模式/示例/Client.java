/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 享元模式.示例;

//客户端类
public class Client {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.factory(new Character('a'));
        fly.operation("First Call");

        fly = factory.factory(new Character('b'));
        fly.operation("Second Call");

        fly = factory.factory(new Character('a'));
        fly.operation("Third Call");
    }

}
