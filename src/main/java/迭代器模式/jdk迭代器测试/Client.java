/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 迭代器模式.jdk迭代器测试;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 描述：
 *
 * @author maguokai
 * @date 2020/4/2 10:59
 * @modified By maguokai
 * @since
 */
public class Client {
    public static void main(String[] args) {
        List list = new ArrayList<String>();
        list.add("zhangsan");
        list.add("lisi");
        list.add("wangwu");
        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }


    }
}