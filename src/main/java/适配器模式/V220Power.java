/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 适配器模式;



/**
 * Created by jingbin on 2016/10/30.
 * 我们拥有的家用电是220v
 */

public class V220Power {

    public int provideV220Power() {
        System.out.println("现有类: 我们提供的是220v的家用电");
        return 220;
    }
}