fun main(args : Array<String>) {
    println("Digite um número: ")
    var numb1: Float = try { readLine()!!.toFloat() } catch (e: Exception) { 0F }

    println("Digite outro número: ")
    var numb2: Float = try { readLine()!!.toFloat() } catch (e: Exception) { 0F }

    //Exibir resultados
    println("A soma entre $numb1 e $numb2 é: ${sum(numb1, numb2)}")
    println("A subtração entre $numb1 e $numb2 é: ${sub(numb1, numb2)}")
    println("A multiplicação entre $numb1 e $numb2 é: ${mult(numb1, numb2)}")
    println("A divisão entre $numb1 e $numb2 é: ${div(numb1, numb2)}")
}

// Funções da calculadora
fun sum(n1: Float, n2: Float): Float = n1 + n2
fun sub(n1: Float, n2: Float): Float = n1 - n2
fun mult(n1: Float, n2: Float): Float = n1 * n2
fun  div(n1: Float, n2: Float): Float = n1 / n2