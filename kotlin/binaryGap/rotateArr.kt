fun solution(A: IntArray, K: Int): IntArray {
   var list = A
   var size = list.size
   var times = K

     var resultList = IntArray(size)
    list.forEachIndexed { index , value -> 
     var position = (index + times)
     if (position >= size){
         position %= size
     }

     resultList[position] = value 
    }
     return resultList
}
