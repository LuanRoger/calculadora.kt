fun main(args : Array<String>) {
    val calc: Calc = Calc()
    println("O que deseja fazer?")
    println("[ 1 ] - Operações básicas.    [ 2 ] - Conversor de temperatura.")
    println("[ 3 ] - Gerar números aleatórios.    [ 0 ] - Sair.")
    var mChoice: Int? = null
    try { mChoice = readLine()!!.toInt() }
    catch (e: Exception) {
        print("Error: ${e.message}")
        System.exit(1)
    }
    when(mChoice) {
        1 -> {
            calc.BasicOperations()
            System.exit(0)
        }
        2 -> {
            calc.Converter()
            System.exit(0)
        }
        3 -> {
            calc.RandomNumb()
            System.exit(0)
        }
        0 -> {
            System.exit(0)
        }
    }
}