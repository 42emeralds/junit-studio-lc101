package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    // 1
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //2
    @Test
    public void stringInsideBalancedBracketsReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    //3
    @Test
    public void stringWithNoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Emerald"));
    }

    //4
    @Test
    public void stringWithUnbalancedBracketsReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Test["));
    }

    //5
    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //6
    @Test
    public void stringStartingWithBracketsReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    //7
    @Test
    public void stringWithOneStartingBracketReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    //8
    @Test
    public void stringWithBracketsInsideStringReturnsTrue () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    //9
    @Test
    public void stringWithOutwardFacingBracketsInsideStringReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    //10
    @Test
    public void singleBracketReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    //11
    @Test
    public void emptyOutwardFacingBracketsReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    //12
    @Test
    public void onlyIdenticalBracketsReturnsFalse () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }



}
