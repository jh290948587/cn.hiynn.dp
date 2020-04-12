/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 模板方法;


/**
 * Created by jingbin on 2016/11/2.
 * 程序员
 */

public class ITWorker extends Worker {

    public ITWorker(String name) {
        super(name);
    }

    /**
     * 重写父类的此方法,使可以查看离开公司时间
     */
    @Override
    public boolean isNeedPrintDate() {
        return true;
    }

    @Override
    public void work() {
        System.out.println("--work"+ "---" + name + ", 写程序 - 测bug - 修复bug");
    }
}