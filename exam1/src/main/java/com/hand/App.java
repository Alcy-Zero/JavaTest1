package com.hand;

public class App
{
    public static void main( String[] args )
    {
        int count = 0;
        int flag = 0;
        int[] xnum =new int[100];
        for(int i=100;i<=200;i++){
            for(int j=2;j<i;j++){
                if((i%j)==0){
                    flag=1;
                }
            }
            if(flag==0){
                xnum[count]=i;
                count++;
            }
            flag=0;
        }
        System.out.print("100-200间共有"+ count +"个素数，分别是：");
        for(int i=0;i<count;i++) {
            System.out.print(xnum[i] + ",");
        }
        System.out.println("\n");
    }
}

