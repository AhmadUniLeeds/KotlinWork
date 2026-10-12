// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    // Write tests here

    @Test
    fun `Mark off -7 gives a ?`() {
        assertEquals("?", grade(-7))
    }
    @Test
    fun `Mark off -1 gives a ?`() {
        assertEquals("?", grade(-1))
    }
    @Test
    fun `Mark off 0 gives a Fail`() {
        assertEquals("Fail", grade(0))
    }
    @Test
    fun `Mark off 30 gives a Fail`() {
        assertEquals("Fail", grade(30))
    }
    @Test
    fun `Mark off 39 gives a Fail`() {
        assertEquals("Fail", grade(39))
    }
    @Test
    fun `Mark off 40 gives a Pass`() {
        assertEquals("Pass", grade(40))
    }
    @Test
    fun `Mark off 55 gives a Pass`() {
        assertEquals("Pass", grade(55))
    }
    @Test
    fun `Mark off 70 gives a Distinction`() {
        assertEquals("Pass", grade(69))
    }
    @Test
    fun `Mark off 71 gives a Distinction`() {
        assertEquals("Distinction", grade(70))
    }
    @Test
    fun `Mark off 80 gives a Distinction`() {
        assertEquals("Distinction", grade(80))
    }
    @Test
    fun `Mark off 100 gives a Distinctioin`() {
        assertEquals("Distinction", grade(100))
    }
    @Test
    fun `Mark off 101 gives a ?`() {
        assertEquals("?", grade(101))
    }
    @Test
    fun `Mark off 107 gives a ?`() {
        assertEquals("?", grade(107))
    }

}
