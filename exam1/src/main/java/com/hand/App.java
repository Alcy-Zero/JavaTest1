package com.hand;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        int count = 0;
        int flag = 0;
        List<Integer> xnum = new ArrayList<>();
        for(int i=100;i<=200;i++){
            for(int j=2;j<i;j++){
                if((i%j)==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                xnum.add(i);
                count++;
            }
            flag=0;
        }
        System.out.print("100-200间共有"+ count +"个素数，分别是："+xnum);
        System.out.println("\n");
    }
}

