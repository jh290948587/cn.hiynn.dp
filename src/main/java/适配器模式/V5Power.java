/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 适配器模式;

/**
 * Created by jingbin on 2016/10/30.
 * 可以看出，手机依赖一个提供5V电压的接口：
 * 提供5v电压的接口
 */

public interface V5Power {

    public int provideV5Power();
}