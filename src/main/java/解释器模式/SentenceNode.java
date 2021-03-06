/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 解释器模式;

//简单句子解释：非终结符表达式
class SentenceNode extends AbstractNode {
    private AbstractNode direction;
    private AbstractNode action;
    private AbstractNode distance;

    public SentenceNode(AbstractNode direction,AbstractNode action,AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }

    //简单句子的解释操作
    public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }
}