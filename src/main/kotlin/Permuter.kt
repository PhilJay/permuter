object Permuter {

    /**
     * Creates all possible combinations (permutations) of the input lists by picking one element from each list.
     * @param input The input list for which to create all possible combinations.
     * @return A list containing all possible combinations.
     */
    fun <T> permute(input: List<List<T>>): List<List<T>> {

        if (input.isEmpty() || input.size == 1)
            return input

        val n = input.size

        val indices = Array(n) { 0 }
        val output = arrayListOf<List<T>>()

        do {
            val combination = arrayListOf<T>()

            for (i in 0 until n) {
                combination.add(input[i][indices[i]])
            }
            output.add(combination)

            var next = n - 1

            while (next >= 0 && (indices[next] + 1 >= input[next].size)) {
                next--
            }

            if (next < 0) {
                return output
            }

            indices[next]++

            for (i in (next + 1) until n) {
                indices[i] = 0
            }

        } while (true)
    }
}