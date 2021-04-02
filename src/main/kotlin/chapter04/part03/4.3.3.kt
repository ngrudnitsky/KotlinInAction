package chapter04.part03

class DelegationCollection<T>(innerList: Collection<T> = ArrayList<T>()) : Collection<T> by innerList

class CountingSet<T>(
  val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet {
  var objectAdded = 0

  override fun add(element: T): Boolean {
    objectAdded++
    return innerSet.add(element)
  }

  override fun addAll(elements: Collection<T>): Boolean {
    objectAdded += elements.size
    return innerSet.addAll(elements)
  }
}
