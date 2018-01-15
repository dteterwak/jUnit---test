package com.junit.classes;

public class Greater{
    final int NUMBER = 0;

    public boolean isGreaterThan(int n){
        boolean result = false;
        if(n>NUMBER)
            result = true;
        return result;
    }


}
