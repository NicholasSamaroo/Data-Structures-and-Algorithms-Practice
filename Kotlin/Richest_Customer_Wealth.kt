fun main() {
    var max = maximumWealth(arrayOf(intArrayOf(7,8,9), intArrayOf(3,2,6), intArrayOf(4,1,0)))
    println(max)
} 

fun maximumWealth(accounts: Array<IntArray>): Int? {
    var sumList: MutableList<Int> = mutableListOf()
    var sum = 0
    
    for(i in 0..accounts.size - 1) {
        for(j in accounts[i]) {
            sum += j
        }
        sumList.add(sum)
        sum = 0
    }
    return sumList.max()
}