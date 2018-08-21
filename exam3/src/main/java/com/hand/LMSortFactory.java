package com.hand;

import com.hand.impl.*;

public class LMSortFactory {
    public LMSort getLMSort(int type) {
        LMSort lmsort = null;
        if (type == 1) {
            lmsort = new LMSort1();
        } else if (type == 2) {
            lmsort = new LMSort2();
        }
        return lmsort;
    }
}
