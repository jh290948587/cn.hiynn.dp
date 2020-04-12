/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 工厂方法;

//文件日志记录器：具体产品
class FileLogger implements Logger {
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}