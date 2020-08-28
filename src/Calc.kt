import java.util.concurrent.ThreadLocalRandom
import kotlin.random.Random

class Calc {
    fun BasicOperations() {
        println("Digite um número: ")
        var numb1: Float = try { readLine()!!.toFloat() } catch (e: Exception) { 0F }

        println("Digite outro número: ")
        var numb2: Float = try { readLine()!!.toFloat() } catch (e: Exception) { 0F }

        //Exibir resultados
        println("A soma entre $numb1 e $numb2 é: ${numb1.plus(numb2)}")
        println("A subtração entre $numb1 e $numb2 é: ${numb1.minus(numb2)}")
        println("A multiplicação entre $numb1 e $numb2 é: ${numb1.times(numb2)}")
        println("A divisão entre $numb1 e $numb2 é: ${numb1.div(numb2)}")
    }
    fun Converter() {
        println("Qual unidade quer converter?")
        println("[ 1 ] - Celsius -> Kelvin.    [ 2 ] - Celsius -> Fahrenheit")
        var tChoice: Int? = null
        try { tChoice = readLine()!!.toInt() }
        catch (e: Exception) {
            println("Error: ${e.message}")
            System.exit(1)
        }

        println("Digite a temperatura em Celsius:")
        var tempCelsius: Float? = null
        try { tempCelsius = readLine()!!.toFloat() }
        catch (e: Exception) {
            print("Error: ${e.message}")
            System.exit(1)
        }
        when(tChoice) {
            1 -> {
                println("A temperatura ${tempCelsius}°C em Kelvin é: ${tempCelsius!!.plus(273.15F)}°K")
            }
            2 -> {
                println("A temperatura ${tempCelsius}°C em Fahrenheit é: ${(tempCelsius!!.times(9/5F)).plus(32)}°F")
            }
        }
    }
    fun RandomNumb() {
        var min: Int? = null
        var max: Int? = null
        try {
            println("Digite um valor minímo:")
            min = readLine()!!.toInt()
            println("Digite um valor maximo:")
            max = readLine()!!.toInt()
        }catch (e: Exception) {
            println("Error: ${e.message}")
            System.exit(1)
        }

        val rand = ThreadLocalRandom.current().nextInt(min!!, max!!)
        println("Número gerado entre ${min} e ${max}: ${rand}")
        println("Gerar outro? [ y/n ]")
        var randAgain: Char? = null
        try { randAgain = readLine()!!.trim().first() }
        catch (e: Exception) {
            println("Error: ${e.message}")
            System.exit(1)
        }
        when(randAgain) {
            'y' -> {
                RandomNumb()
            }
            'n' -> {
                return
            }
        }
    }
}