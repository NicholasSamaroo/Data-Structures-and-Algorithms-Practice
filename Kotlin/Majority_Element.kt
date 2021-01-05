fun main() {
    val inputArray = intArrayOf(3,3,4)
    var num = majorityElement(inputArray)
    println(num)
}

fun majorityElement(nums: IntArray) : Int? {
    var max = nums.groupBy{it}.maxByOrNull{it.value.size}
    return max?.key
}