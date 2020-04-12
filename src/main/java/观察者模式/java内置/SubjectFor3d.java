/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 观察者模式.java内置;

import java.util.Observable;

public class SubjectFor3d extends Observable
{
    private String msg ;


    public String getMsg()
    {
        return msg;
    }


    /**
     * 主题更新消息
     *
     * @param msg
     */
    public void setMsg(String msg)
    {
        this.msg = msg  ;
        setChanged();
        notifyObservers();
    }
}
