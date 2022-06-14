fun solution(A: IntArray): Int {
    var list = A.toMutableList()
    var set = list.toSet()

    set.forEach { s ->
      var findNumb = list.filter { it == s }
      if (findNumb.size > 1){
          findNumb.forEach {
              var index = list.indexOf(it)
              list.removeAt(index)
          }
      }
    }
   var result = list.first()
   return result
}
