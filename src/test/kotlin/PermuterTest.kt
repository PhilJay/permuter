import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.math.pow

class PermuterTest {

    @Test
    fun testCombinationsSmall() {

        val a1 = arrayListOf(1, 2, 3)
        val a2 = arrayListOf(4, 5, 6)
        val input = arrayListOf(a1, a2)
        val expectedSize = a1.size.toDouble().pow(input.size).toInt()

        val combinations = Permuter.permute(input)
        assertEquals(expectedSize, combinations.size)
    }

    @Test(timeout = 1000)
    fun testCombinationsLarge() {

        val size = 7
        val a1 = IntArray(size) { it }.toMutableList()
        val a2 = IntArray(size) { it + size * 1 }.toMutableList()
        val a3 = IntArray(size) { it + size * 2 }.toMutableList()
        val a4 = IntArray(size) { it + size * 3 }.toMutableList()
        val a5 = IntArray(size) { it + size * 4 }.toMutableList()
        val a6 = IntArray(size) { it + size * 5 }.toMutableList()
        val a7 = IntArray(size) { it + size * 6 }.toMutableList()
        val input = arrayListOf(a1, a2, a3, a4, a5, a6, a7)

        val expectedSize = a1.size.toDouble().pow(input.size).toInt()

        val combinations = Permuter.permute(input)
        assertEquals(expectedSize, combinations.size)
    }

    @Test
    fun testCombinationsIrregularArraySize() {

        val a1 = arrayListOf(1, 2, 3)
        val a2 = arrayListOf(4)
        val a3 = arrayListOf(7, 8)
        val input = arrayListOf(a1, a2, a3)

        val combinations = Permuter.permute(input)
        assertEquals(6, combinations.size)

        assertEquals(arrayListOf(1, 4, 7), combinations[0])
        assertEquals(arrayListOf(1, 4, 8), combinations[1])
        assertEquals(arrayListOf(2, 4, 7), combinations[2])
        assertEquals(arrayListOf(2, 4, 8), combinations[3])
        assertEquals(arrayListOf(3, 4, 7), combinations[4])
        assertEquals(arrayListOf(3, 4, 8), combinations[5])
    }

    @Test
    fun testEmptyInput() {

        val input = arrayListOf<List<Int>>()
        val combinations = Permuter.permute(input)
        assertEquals(0, combinations.size)
        assertEquals(input, combinations)
    }

    @Test
    fun testSingleArray() {

        val a1 = arrayListOf(1, 2, 3)
        val input = arrayListOf(a1)

        val combinations = Permuter.permute(input)
        assertEquals(1, combinations.size)

        assertEquals(a1, combinations[0])
    }
}