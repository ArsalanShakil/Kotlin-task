import org.junit.Test
import kotlin.test.assertEquals

class Tests {


    @Test
     fun exercise1() {
        val test1 :Pair<Int, String> = Pair(1, "one")
        val test2 :Pair<Int, String> = Pair(2, "two")
        val test3 :Pair<Int, String> = Pair(3, "three")
        val test4 :Pair<Int, String> = Pair(4, "four")
        val test5 :Pair<Int, String> = Pair(5, "five")
        val test6 :Pair<Int, String> = Pair(6, "six")
        val test7 :Pair<Int, String> = Pair(7, "seven")
        val test8 :Pair<Int, String> = Pair(8, "eight")
        val test9 :Pair<Int, String> = Pair(9, "nine")
        val test10 :Pair<Int, String> = Pair(10, "ten")


        val nt = NumberTranslator(setOf(test1,test2,test3,test4,test5,test6,test7,test8,test9,test10))
        assertEquals("two",nt.translate(2))
        assertEquals("eight",nt.translate(8))
        assertEquals("unknown",nt.translate(12))
        assertEquals("one",nt.translate(1))

    }

   @Test
   fun exercise5() {
      val w = Word("Finnish", "go")
      w.addTranslation(Word("Finnish","gookhbkbd"))
      w.addTranslation(Word("Finnish","gmhhmhmod"))
      w.addTranslation(Word("Finnish","gbvmvoo"))
      print(w.closestTranslations(7,"Finnish"))
   }

}