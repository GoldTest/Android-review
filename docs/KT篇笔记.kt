package docs

object S1 {
    /**
     * 1，函数写法
     */
    fun s1Sum(a: Int, b: Int): Int {

        return a + b
    }

    fun s1Sum1(a: Int, b: Int) = a + b
    fun s1SumUnit(a: Int): Unit = Unit

    /**
     * 2,遍历
     */
    fun run1() {
        val a = 1..5
        print("\nout $a")
        val input = 3
        when (input) {
            in a, is Int -> print("\ninput in int")
            is Int -> ""
            else -> {}
        }
        val maps = mapOf<String, Int>("1" to 1, "2" to 2)
        for ((k, value) in maps) {
            print("\n$k -> $value")
        }
    }

    /**
     * 3，基本类型
     */
    fun run2() {
        val string = """
            
            DO run this Action
            ${'$'}WITH ME
        """.trimIndent()
        print(string)

        lateinit var nullString: String
        kotlin.runCatching {
            print("\n${nullString}")
        }
        val aValue:Int by lazy {
            "3322".toInt()
        }
        print("\n$aValue")
    }
}
