fun main()
{
    println("Введите n x (через пробел)")

    val s = readLine()?.split(" ")

    if (s != null && s.size == 2)
    {
        val n = s[0].toIntOrNull()
        val x = s[1].toIntOrNull()

        if (n != null && x != null && x > 1)
        {
            var y = 0
            var p = 1
            while (p < n)
            {
                p *= x
                y++
            }

            if (p == n)
            {
                println(y)
            }

            else
            {
                println("показатель не существует")
            }
        }

        else
        {
            println("основание > 1")
        }
    }

    else
    {
        println("введите выражение в правильном формате.")
    }
}
