fun main() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    for (i in mutableList.indices) {
        mutableList[i] *= 2
    }
    println(mutableList) // Output: [2, 4, 6, 8, 10]

    //Alternatively, using mapIndexed and assigning back
    val mutableList2 = mutableListOf(1, 2, 3, 4, 5)
    mutableList2.mapIndexed { index, value -> mutableList2[index] = value * 2 }
    println(mutableList2) // Output: [2, 4, 6, 8, 10]
} 