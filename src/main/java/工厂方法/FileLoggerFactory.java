/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 工厂方法;

//文件日志记录器工厂类：具体工厂
class FileLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        //创建文件，代码省略
        return logger;
    }
}