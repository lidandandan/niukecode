package com.factory.model;

/**
 * Created by yixinf-q on 2018/9/11.
 */
import com.factory.*;
public class noddlesFactory {
    public static final int typeA=1;
    public static final int typeB=2;
    public static final int typeC=3;
    public static Inoddles createNoodles(int type)
    {
        if(type==1)
    {
        return new Anoddles();
    }
        if(type==2)
        {
            return new Bnoddles();
        }


        return new Bnoddles();
    }


}
