/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 工厂方法;

//日志记录器工厂接口：抽象工厂
interface LoggerFactory {
    public Logger createLogger();
}