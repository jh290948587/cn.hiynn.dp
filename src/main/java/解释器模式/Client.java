/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 解释器模式;

/**
 * 描述：
 *
 * @author maguokai
 * @date 2020/4/3 9:51
 * @modified By maguokai
 * @since
 */
class Client {
    public static void main(String args[]) {
        String instruction = "up move 5 and down run 10 and left move 5";
        InstructionHandler handler = new InstructionHandler();
        handler.handle(instruction);
        String outString;
        outString = handler.output();
        System.out.println(outString);
    }
}