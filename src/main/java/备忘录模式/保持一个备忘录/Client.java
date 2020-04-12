/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 备忘录模式.保持一个备忘录;

/**
 * 描述：
 *
 * @author maguokai
 * @date 2020/4/3 9:33
 * @modified By maguokai
 * @since
 */
class Client {
    public static void main(String args[]) {
        MementoCaretaker mc = new MementoCaretaker();
        Chessman chess = new Chessman("车",1,1);
        display(chess);
        mc.setMemento(chess.save()); //保存状态
        chess.setY(4);
        display(chess);
        mc.setMemento(chess.save()); //保存状态
        display(chess);
        chess.setX(5);
        display(chess);
        System.out.println("******悔棋******");
        chess.restore(mc.getMemento()); //恢复状态
        display(chess);
    }

    public static void display(Chessman chess) {
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }
}