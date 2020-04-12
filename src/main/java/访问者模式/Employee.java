/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 访问者模式;

import java.util.*;

//员工类：抽象元素类
interface Employee
{
    public void accept(Department handler); //接受一个抽象访问者访问
}