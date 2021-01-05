fun main() {
    var nums = intArrayOf(1,2,3,4,4,3,2,1)
    val n = 4
    for(i in shuffle(nums,n)) {
        print("$i ")
    }
}

fun shuffle(nums: IntArray, n: Int) : IntArray {
    var finalList: IntArray = IntArray(2 * n)
    var x = 0
    var y = n
    var runner = 0

    while(x <= n - 1 && y <= nums.size - 1) {
        finalList[runner] = nums[x]
        ++runner
        finalList[runner] = nums[y]
        ++runner
        ++x
        ++y
    }  
    return finalList
}