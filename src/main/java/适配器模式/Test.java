/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 适配器模式;

/**
 * 描述：
 *
 * @author maguokai
 * @date 2020/3/30 0:09
 * @modified By maguokai
 * @since
 */
public class Test {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V5Power v5Power = new V5PowerAdapter(new V220Power());
        mobile.inputPower(v5Power);
    }

}