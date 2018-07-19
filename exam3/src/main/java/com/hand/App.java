package com.hand;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        LMSortFactory lmSortFactory = new LMSortFactory();
        LMSort lmsort1 = lmSortFactory.getLMSort(1);
        LMSort lmSort2 = lmSortFactory.getLMSort(2);



    }
}
