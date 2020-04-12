/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 解释器模式;

//距离解释：终结符表达式
class DistanceNode extends AbstractNode {
    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    //距离表达式的解释操作
    public String interpret() {
        return this.distance;
    }
}