package epam.UnitTesting;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
	ExcludeA excludeA;
    @BeforeEach
    void setUp()
    {
        excludeA = new ExcludeA();
    }

    @Test
    void excludeATest_lengthGreaterThanEqualTo2_firstTwoContainA()
    {
        assertEquals("CM", excludeA.excludeA("AACM"));
        assertEquals("CN", excludeA.excludeA("ACN"));
        assertEquals("BM", excludeA.excludeA("BAM"));
        assertEquals("", excludeA.excludeA("AA"));
        assertEquals("B", excludeA.excludeA("AB"));
        assertEquals("B", excludeA.excludeA("BA"));
    }

    @Test
    void excludeATest_lengthGreaterThanEqualTo2_firstTwoDoesNotContainA()
    {
        assertEquals("DFJGA", excludeA.excludeA("DFJGA"));
    }

    @Test
    void excludeATest_lengthLessThan2()
    {
        assertEquals("X", excludeA.excludeA("X"));
        assertEquals("", excludeA.excludeA("A"));
    }
}
