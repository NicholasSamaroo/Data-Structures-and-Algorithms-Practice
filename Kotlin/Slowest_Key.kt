
fun main() {
    var releaseTimes = intArrayOf(12,23,36,46,62)
    var keysPressed = "spuda"
    println(slowestKey(releaseTimes,keysPressed))
}



fun slowestKey(releaseTimes: IntArray, keysPressed: String): Char? {
        var maxMapping: MutableMap<Char,Int> = mutableMapOf()
        maxMapping.put(keysPressed[0], releaseTimes[0])
        
       for(i in 1..releaseTimes.size - 1) {
        if(maxMapping.contains(keysPressed[i]) && (maxMapping.get(keysPressed[i]) ?: 0) < releaseTimes[i] - releaseTimes[i - 1]) {
            maxMapping.put(keysPressed[i], releaseTimes[i] - releaseTimes[i - 1])
        } else if(!(maxMapping.contains(keysPressed[i]))) {
            maxMapping.put(keysPressed[i], releaseTimes[i] - releaseTimes[i - 1])
        } else {
            continue
        }
    }
    return maxMapping.toList().groupBy{it.second}.maxBy{it.key}?.value?.maxBy{it.first}?.first
}