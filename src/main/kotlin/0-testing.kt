fun duplicateZeros(arr: IntArray): IntArray {
    var i = 0
    while (i < arr.size) {
        if (arr[i] == 0) {
            for (j in arr.size - 1 downTo i + 1)
                arr[j] = arr[j - 1]
            i++
        }
        i++
    }
    return arr
}

fun main() {
    var arr1 = intArrayOf(1,0,2,3,0,4,5,0)
    var arr2 = intArrayOf(1,2,3)

    for (i in arr1) print("$i ")

    println()

    var dupZeroArr1 = duplicateZeros(arr1)
    for (i in dupZeroArr1) print("$i ")
}
