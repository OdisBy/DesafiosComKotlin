package praticandoComDesafiosDeCodigoKotlinNaDIO

/**
*   Resolução do Desafio '1/3 - Data por Extenso' da série 'Praticando com Desafios de Código Kotlin na DIO'
*/

/**
 * Para esse desafio eu crio um enum contendo todos os meses possíveis
 * na varíavel mesPorExtenso eu uso o enum.values()[indice] para obter o valor com o indice dele no enum...
 * ... Lembrando que o enum começa a partir do 0, e ao escrevermos o mês começamos pelo 1, então eu devo subtrair 1 do valor do mês passado na entrada para obter o resultado correto
 */

fun main() {
    val entrada: String? = readLine()
  val (dia, mes, ano) = entrada!!.split("/")

  val mesPorExtenso = when (mes.toInt()) {
      in 1..12 -> MesesExtenso.values()[mes.toInt() - 1]
      else -> "Mês Inválido!"
  }
  println("$dia de $mesPorExtenso de $ano")
}

enum class MesesExtenso{
 Janeiro,
 Fevereiro,
 Março,
 Abril,
 Maio,
 Junho,
 Julho,
 Agosto,
 Setembro,
 Outubro,
 Novembro,
 Dezembro
}