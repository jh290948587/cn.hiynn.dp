/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 观察者模式.java内置;

import java.util.Observable;
import java.util.Observer;

public class Observer1 implements Observer
{

    public void registerSubject(Observable observable)
    {
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg)
    {
        if (o instanceof SubjectFor3d)
        {
            SubjectFor3d subjectFor3d = (SubjectFor3d) o;
            System.out.println("subjectFor3d's msg -- >" + subjectFor3d.getMsg());
        }

        if (o instanceof SubjectForSSQ)
        {
            SubjectForSSQ subjectForSSQ = (SubjectForSSQ) o;
            System.out.println("subjectForSSQ's msg -- >" + subjectForSSQ.getMsg());
        }
    }
}
