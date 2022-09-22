package samples

import docs.S1
import java.awt.Rectangle

fun main() {
    val user = User("jack",20)
    val (hack,age) = user
    val copy = user.copy(age = 10)
    print(copy.toString())
    print("\nout ${S1.s1SumUnit(1)}")

    S1.run1()
    S1.run2()

    val inta:Long = 24*60*60*1000*1000
    val intb = 24*60*60*1000
    print("\n${inta/intb}")
}

data class User(val name: String = "", var age: Int = 0)