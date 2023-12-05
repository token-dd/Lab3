package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class TritypeTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 7));
        assertEquals(4, tri.Triang(-1, -2, -7));
        assertEquals(4, tri.Triang(2, 2, 7));
        assertEquals(2, tri.Triang(7, 2, 7));
        assertEquals(2, tri.Triang(2, 3, 3));
        assertEquals(2, tri.Triang(4, 4, 7));
        assertEquals(3, tri.Triang(7, 7, 7));
        assertEquals(1, tri.Triang(4, 5, 7));
    }
    @Test
    public void testMain(){
        Tritype tritype = new Tritype();
        tritype.main(new String[]{"","",""});
    }

}