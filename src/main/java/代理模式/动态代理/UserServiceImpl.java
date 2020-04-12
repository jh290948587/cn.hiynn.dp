/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 代理模式.动态代理;

/**
 * 描述：
 *
 * @author maguokai
 * @date 2020/4/3 10:25
 * @modified By maguokai
 * @since
 */
public class UserServiceImpl implements Service {
    public void add() {
        System.out.println("This is add service");
    }
}