/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 备忘录模式.保持多个备忘录;

import java.util.*;

class MementoCaretaker {
    //定义一个集合来存储多个备忘录
    private ArrayList mementolist = new ArrayList();

    public ChessmanMemento getMemento(int i) {
        return (ChessmanMemento)mementolist.get(i);
    }

    public void setMemento(ChessmanMemento memento) {
        mementolist.add(memento);
    }
}