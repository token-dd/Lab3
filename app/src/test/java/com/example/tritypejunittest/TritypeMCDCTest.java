package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMCDCTest {
    /*
    *所选decision
    * if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
        {
            triOut = 4;
            return (triOut);
        }
    * */
    @Test
    public void mcdcTest(){
        Tritype tri = new Tritype();
        //遍历所有condition和decision的真/假
        //decision -> true
        //Side1 <= 0 -> true
        assertEquals(4,tri.Triang(0,1,1));
        //Side1 <= 0 -> false,Side2 <= 0 -> true
        assertEquals(4,tri.Triang(1,0,1));
        //Side1 <= 0 -> false,Side2 <= 0 -> false,Side3 <= 0 -> true
        assertEquals(4,tri.Triang(1,1,0));

        //decision -> false
        //Side1 <= 0 -> false,Side2 <= 0 -> false,Side3 <= 0 -> false
        assertEquals(3,tri.Triang(1,1,1));
    }

}