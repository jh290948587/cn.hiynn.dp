/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 观察者模式.java内置;


public class Test
{
    public static void main(String[] args)
    {
        SubjectFor3d subjectFor3d = new SubjectFor3d() ;
        SubjectForSSQ subjectForSSQ = new SubjectForSSQ() ;

        Observer1 observer1 = new Observer1();
        observer1.registerSubject(subjectFor3d);
        observer1.registerSubject(subjectForSSQ);


        subjectFor3d.setMsg("hello 3d'nums : 110 ");
        subjectForSSQ.setMsg("ssq'nums : 12,13,31,5,4,3 15");

    }
}
