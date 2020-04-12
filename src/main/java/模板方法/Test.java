/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 模板方法;

/**
 * 描述：
 *
 * @author maguokai
 * @date 2020/3/30 17:59
 * @modified By maguokai
 * @since
 */
public class Test {
    public static void main(String[] args) {
        Worker qaWorker = new ITWorker("测试人员");
        qaWorker.workOneDay();
    }

}