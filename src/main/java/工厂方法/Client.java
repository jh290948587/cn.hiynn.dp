/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 工厂方法;

/**
 * 描述：
 *
 * @author maguokai
 * @date 2020/4/6 13:44
 * @modified By maguokai
 * @since
 */
class Client {
    public static void main(String args[]) {
        LoggerFactory factory;
        Logger logger;
        factory = new FileLoggerFactory(); //可引入配置文件实现
        logger = factory.createLogger();
        logger.writeLog();
    }
}