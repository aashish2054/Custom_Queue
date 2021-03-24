import org.scalatest.flatspec.AnyFlatSpec
class QueueTest extends AnyFlatSpec {
val queueTest=new Queue[Int]
  "enqueue" should "insert an item" in {
    val result = queueTest.enqueue(List() , 1)
    assert(result == List(1))
  }

  "dequeue " should "remove an item" in {
    val queue = queueTest.enqueue(List(1,2) , 3)
    val result = queueTest.dequeue(queue)
    assert(result == List(2,3))
  }

  it should "not remove the item" in {
    assertThrows[NoSuchElementException] {
      queueTest.dequeue(List())
    }
  }

  "isEmpty" should " return true " in {
    val queue = List.empty[Int]
    val result = queueTest.isEmpty(queue)
    assert(result)
  }

  val queueString = new Queue[String]

  "enqueue" should "add an item" in {
    val result =queueString.enqueue(List() , "Knoldus")
    assert(result == List("Knoldus"))
  }

  "dequeue " should "remove the item of String " in {
    val queue = queueString.enqueue(List("Knoldus","Ashish") ,"Chaudhary")
    val result = queueString.dequeue(queue)
    assert(result == List("Ashish" , "Chaudhary"))
  }

  it should "not remove any item of String" in {
    assertThrows[NoSuchElementException] {
      queueString.dequeue(List())
    }
  }


}
