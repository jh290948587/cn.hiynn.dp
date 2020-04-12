/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 建造者模式.游戏角色创建;

//英雄角色建造器：具体建造者
class HeroBuilder extends ActorBuilder
{
    public  void buildType()
    {
        actor.setType("英雄");
    }
    public  void buildSex()
    {
        actor.setSex("男");
    }
    public  void buildFace()
    {
        actor.setFace("英俊");
    }
    public  void buildCostume()
    {
        actor.setCostume("盔甲");
    }
    public  void buildHairstyle()
    {
        actor.setHairstyle("飘逸");
    }
}