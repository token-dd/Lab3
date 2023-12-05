package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeDecisionTest {
    /*
    *所选decision
    * if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
        {
            triOut = 4;
            return (triOut);
        }
    * */
    @Test
    public void decisionTest(){
        Tritype tritype = new Tritype();
        //遍历decision的true/false
        //decision -> true
        assertEquals(4,tritype.Triang(0,1,1));
        //decision -> false
        assertEquals(3,tritype.Triang(1,1,1));
    }

}