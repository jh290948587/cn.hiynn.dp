/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 享元模式.五子棋;

import java.awt.*;

//具体享元角色：黑子
class BlackPieces implements ChessPieces
{
    public void DownPieces(Graphics g, Point pt)
    {
        g.setColor(Color.BLACK);
        g.fillOval(pt.x,pt.y,30,30);
    }
}