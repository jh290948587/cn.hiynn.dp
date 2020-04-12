package 享元模式.五子棋;

import java.awt.*;

//抽象享元角色：棋子
interface ChessPieces
{
    public void DownPieces(Graphics g, Point pt);    //下子
}
