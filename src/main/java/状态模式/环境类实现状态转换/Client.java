/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 状态模式.环境类实现状态转换;

/**
 * 描述：
 *
 * @author maguokai
 * @date 2020/4/1 12:21
 * @modified By maguokai
 * @since
 */
class Client {
    public static void main(String args[]) {
        Screen screen = new Screen();
        screen.onClick();
        screen.onClick();
        screen.onClick();
    }
}