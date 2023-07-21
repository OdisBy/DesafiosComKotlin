package praticandoComDesafiosDeCodigoKotlinNaDIO

/**
 *   Resolução do Desafio '3 / 3 - Taxa de Crescimento' da série 'Praticando com Desafios de Código Kotlin na DIO'
 */

/**
 * No data class Pais eu criei uma varíavel privada [taxaCrescimentoPorcentagem] em que faço a [taxaCrescimento] para ser usada como porcentagem com multiplicação
 * A função irá fazer um cálculo básico de porcentagem
 * No while eu chamo a fun crescerPopulacaoAnual para cada um dos dois países criados, e após isso aumento 1 ano
 * Printo a quantidade final de anos
 */

data class Pais(var habitantes: Double, val taxaCrescimento: Double) {
    private val taxaCrescimentoPorcentagem = taxaCrescimento / 100
    fun crescerPopulacaoAnual() {
        habitantes += habitantes * taxaCrescimentoPorcentagem
    }
}

fun main() {
    val habitantesPaisA = readLine()!!.toDouble();
    val habitantesPaisB = readLine()!!.toDouble();
    val paisA = Pais(habitantesPaisA, taxaCrescimento = 3.0)
    val paisB = Pais(habitantesPaisB, taxaCrescimento = 1.5)

    var quantidadeAnos = 0
    while (paisA.habitantes < paisB.habitantes) {
        paisA.crescerPopulacaoAnual()
        paisB.crescerPopulacaoAnual()
        quantidadeAnos++
    }

    println("$quantidadeAnos anos")
}