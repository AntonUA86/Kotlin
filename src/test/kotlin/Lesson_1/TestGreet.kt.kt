import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.IllegalArgumentException

class `TestGreet` {

    @Test
    fun `имя для Светы Ивановой`()
    {
        // Sveta Ivanova -> Hello, Sveta Ivanova
        assertEquals("Hello, Sveta Ivanova", greeting("Sveta", "Ivanova"))
    }
}

class TestSalary {

    @Test
    fun testSalary()
    {
        assertEquals(150_000.toBigDecimal(), japaneseSalary(100_000.toBigDecimal(), 5))
    }

    @Test
    fun testNegativeSalary()
    {
        val thrown = assertThrows<IllegalArgumentException> {
            japaneseSalary((-10).toBigDecimal(), 12)
        }
        // thrown.message
        assertEquals("Base salary can't be negative", thrown.message)

    }

}