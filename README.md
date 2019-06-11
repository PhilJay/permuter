# Permuter
Kotlin implementation for creating permutations (possible combinations) of a 2D array / 2D list

## Usage

```kotlin
    val a1 = arrayListOf(1, 2, 3)
    val a2 = arrayListOf(4)
    val a3 = arrayListOf(7, 8)
    val input = arrayListOf(a1, a2, a3)

    val permutations = Permuter.permute(input)
    print(permutations)
    // 1 4 7
    // 1 4 8
    // 2 4 7
    // 2 4 8
    // 3 4 7
    // 3 4 8
```
