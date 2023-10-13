import kotlin.math.pow

fun main(){
    println("Informe o capital inicial (C): ")
    val capital = readLine()?.toDouble()?: 0.0

    println("Informe a taxa de juros anual (i): ")
    val interestRate = readLine()?.toDouble() ?: 0.0

    print("Informe o número de anos (t): ")
    val years = readLine()?.toInt() ?: 1

    val montante = capital * (1 + interestRate).pow(years)

    println("O montante total após $years anos será: R$%.2f".format(montante))
}