package com.duan;

import org.junit.jupiter.api.Test;

public class getname
{
    public static int getNmb(int x,int y)
    {
        int z = 1;
        int ret =0;
        if (x<0){
            z=y-x;
        }
        else{
            z=y+x;
        }
        if(z<10 && y>0)
        {
            ret = z*y;
        }
        else
        {
            ret= z*x;
        }
        return ret;
    }
    @Test
             void test1(){
    int result=getname.getNmb(1,1);
    System.out.println(result);
    }

    @Test
    void test2(){
        int result=getname.getNmb(1,-1);
        System.out.println(result);
    }

@Test
             void test3(){
                     int result=getname.getNmb(-1,1);
                     System.out.println(result);
                     }
@Test
             void test4(){
                     int result=getname.getNmb(-1,-1);
                     System.out.println(result);
                     }

    @Test
    void test5(){
        int result=getname.getNmb(-1,-1);
        System.out.println(result);
    }



    @Test
    void test6(){
        int result=getname.getNmb(-1,-1);
        System.out.println(result);
    }

    @Test
    void test7(){
        int result=getname.getNmb(-1,-1);
        System.out.println(result);
    }
     @Test
    void test8(){
        int result=getname.getNmb(-1,-1);
        System.out.println(result);
    }
}
