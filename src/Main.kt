fun main() {
    val input = intArrayOf(12, 11, 13, 5, 6, 7)
    println(System.currentTimeMillis())
    BubbleSort().execute(input)
    println(System.currentTimeMillis())
    println(input.toList())
}

class MergeSort {
    fun execute(input: IntArray) {
        if (input.size <= 1) return
        val half = input.size / 2
        val left = input.copyOfRange(0, half)
        val right = input.copyOfRange(half, input.size)
        execute(left)
        execute(right)
        var i = 0 // left count
        var j = 0 // right count
        var k = 0 // input current index
        while (i < left.size && j < right.size) {
            if (left[i] < right[j]) input[k++] = left[i++]
            else input[k++] = right[j++]
        }
        while (i < left.size) input[k++] = left[i++]
        while (j < right.size) input[k++] = right[j++]
    }
}

class BubbleSort {
    fun execute(input: IntArray) {
        var temp: Int
        var swapped: Boolean
        do {
            swapped = false
            for (i in 1..<input.size) {
                if (input[i - 1] > input[i]) {
                    temp = input[i]
                    input[i] = input[i - 1]
                    input[i - 1] = temp
                    swapped = true
                }
            }
        } while (swapped)
    }
}