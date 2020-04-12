/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 备忘录模式.保持一个备忘录;

//象棋棋子备忘录管理类：负责人
class MementoCaretaker {
    private ChessmanMemento memento;

    public ChessmanMemento getMemento() {
        return memento;
    }

    public void setMemento(ChessmanMemento memento) {
        this.memento = memento;
    }
}