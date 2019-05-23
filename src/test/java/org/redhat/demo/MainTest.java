package org.redhat.demo;

import java.util.Random;

import org.junit.Test;
import org.redhat.demo.Main;

import static org.junit.Assert.assertEquals;

public class MainTest {

    private static final int MODULO = (int) (Math.pow(10, 9) + 7);

    @Test
    public void nthMagicalNumberTest() {
        assertEquals(Main.nthMagicalNumber(49995, 456, 345), 9855984);
    }

    @Test
    public void nthMagicalNumberNequalZeroTest() {
        Random rand = new Random();
        int randomA = rand.nextInt();
        int randomB = rand.nextInt();
        assertEquals(Main.nthMagicalNumber(0, randomA, randomB), 0);
    }

    @Test
    public void nthMagicalNumberAandBEqualTest() {
        Random rand = new Random();
        int randomA = rand.nextInt();
        int N = rand.nextInt();
        assertEquals(Main.nthMagicalNumber(N, randomA, randomA), ((long) randomA * (long) N) % MODULO);
    }

    @Test
    public void nthMagicalNumberNequalOneTest() {
        Random rand = new Random();
        int randomA = rand.nextInt();
        int randomB = rand.nextInt();
        assertEquals(Main.nthMagicalNumber(1, randomA, randomB), ((Math.min(randomA, randomB)) % MODULO));
    }
}