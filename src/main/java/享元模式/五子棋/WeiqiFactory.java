/*
 * Copyright (C), 2013-2020, 天津大海云科技有限公司
 */
package 享元模式.五子棋;

import java.util.ArrayList;

//享元工厂角色
class WeiqiFactory
{
    private ArrayList<ChessPieces> qz;
    public WeiqiFactory()
    {
        qz=new ArrayList<ChessPieces>();
        ChessPieces w=new WhitePieces();
        qz.add(w);
        ChessPieces b=new BlackPieces();
        qz.add(b);
    }
    public ChessPieces getChessPieces(String type)
    {
        if(type.equalsIgnoreCase("w"))
        {
            return (ChessPieces)qz.get(0);
        }
        else if(type.equalsIgnoreCase("b"))
        {
            return (ChessPieces)qz.get(1);
        }
        else
        {
            return null;
        }
    }
}