fun solution(A: IntArray): Int {
   var list = A
   var flag = 0
   var peak = ArrayList<Int>()
   
   list.forEachIndexed { index , l -> 
    var nextIndex = index + 1
    var beforeIndex = index - 1
    if (beforeIndex > 0 && nextIndex <= list.size){
       if (l >= list[beforeIndex] && l >= list[nextIndex]) { 
        peak.add(list[nextIndex])
    }
    }
   }

   flag = peak.toSet().size

   return flag
}
