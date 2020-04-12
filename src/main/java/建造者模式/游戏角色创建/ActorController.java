/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 建造者模式.游戏角色创建;

//游戏角色创建控制器：指挥者
class ActorController
{
    //逐步构建复杂产品对象
    public Actor construct(ActorBuilder ab)
    {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstyle();
        actor=ab.createActor();
        return actor;
    }
}