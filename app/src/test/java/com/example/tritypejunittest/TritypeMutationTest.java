package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMutationTest {
    @Test
    public void mutationTest(){
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(2, 2, 7));
        assertEquals(4, tri.Triang(2, 2, 4));

        TritypeMutantOne tritypeMutantOne = new TritypeMutantOne();
        //expected原本为4，由于triOut = triOut + 1;被修改为triOut = triOut + 2;
        //原本应判定if (triOut == 1 && Side1+Side2 > Side3)
        //现在变为判定if (triOut == 2 && Side1+Side3 > Side2)
        assertEquals(2, tritypeMutantOne.Triang(2, 2, 7));

        TritypeMutantTwo tritypeMutantTwo = new TritypeMutantTwo();
        //expected原本为4，由于else if (triOut == 1 && Side1+Side2 > Side3)被修改为if (triOut == 1 && Side1+Side2 >= Side3)
        //导致原本为false的(2,2,4)被判定为true
        assertEquals(2, tritypeMutantTwo.Triang(2, 2, 4));
    }

}