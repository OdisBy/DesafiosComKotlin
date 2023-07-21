package praticandoComDesafiosDeCodigoKotlinNaDIO

/**
 *   Resolução do Desafio '2 / 3 - Numeral Romano' da série 'Praticando com Desafios de Código Kotlin na DIO'
 */

/**
 * Essa solução é usando o while, pois não consegui atender todos os números romanos usando o for, porém minha resolução com uma prévia do for está no bloco de comentário abaixo
 *
 * A varíavel [numeroRomano] salva o valor escrito pelo usuário, fazemos uma verificação se ele é nulo ou está vazio, caso sim retornamos já o código
 *
 * while:
 * val atual: valor, em Int, do número romano atual
 * val proximo: verificará se existe uma letra após a atual, caso tenha ela será salva na varíavel, caso não o valor será 0
 *
 * Caso o próximo seja 0 quer dizer que esse é o último loop, então somamos o valor atual e quebramos o loop
 *
 * Caso o próximo seja maior que o atual quer dizer que devemos fazer uma subtração, após a subtração colocamos i += 2, pois usamos duas casas na string para a conta
 * Caso o código não tenha finalizado ainda quer dizer que o número é normal e devemos apenas somar o resultado com o atual, usaremos o i++ para rodarmos o próximo while
 */

/**
 * Solução usando o for, porém não consegui atender aos casos que tenham duas subtrações ou outros subtrações além do 4
 * A varíavel [numeroRomano] salva o valor escrito pelo usuário, e o for roda o loop para cada uma das letras
 *
 * for:
 * val atual: valor, em Int, do número romano atual
 * val proximo: verificará se existe uma letra após a atual, caso tenha ela será salva na varíavel, caso não o valor será 0
 *
 * Começamos verificando se a varíavel atual é diferente de 1, pois caso não seja 1 não tem chances de o valor final ser 4 o próximo, e então uso continue para ir para o próximo for
 * Caso o valor atual seja 1 então devemos verificar se o próximo valor é o 5, por que caso seja então quer dizer que o valor atual é 4.
 * Usamos a varíavel proximo para pegar o valor
 * Caso o próximo valor seja 5 então sabemos que o valor atual é 4, pois IV = 4...
 * ... Após somar o resultado com 4 eu uso a palavra-chave break, pois seguindo a regras dos números romanos não é possível ter nenhum outro número após o 4...
 * ... O break termina o loop por completo, e impede que o loop rode novamente com a letra V e some mais 5 ao resultado final.
 * print o resultado
 */
fun main() {
    val numeroRomano: String? = readLine()

    val numerosRomanos = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    // Inicia a variavel resultado
    var resultado : Int = 0

    if(numeroRomano.isNullOrEmpty()){
        return
    }

    // Indice para ser usado no while
    var i = 0
    while (i < numeroRomano.length) {
        val atual = numerosRomanos.getValue(numeroRomano[i])

        val proximo = when (i + 1) {
            numeroRomano.length -> 0
            else -> numerosRomanos.getValue(numeroRomano[i + 1])
        }

        if(proximo == 0){
            resultado += atual
            break
        }

        if (atual < proximo) {
            resultado += proximo - atual
            // Avança dois caracteres (já que usamos dois caracteres para a representação de subtração)
            i += 2
            continue
        }

        resultado += atual
        i++
    }

    print(resultado)
}



// Utilizando o for
//fun main() {
//    val numeroRomano: String? = readLine()
//
//    val numerosRomanos = mapOf(
//        'I' to 1,
//        'V' to 5,
//        'X' to 10,
//        'L' to 50,
//        'C' to 100,
//        'D' to 500,
//        'M' to 1000
//    )
//    // Inicia a variavel resultado
//    var resultado : Int = 0
//
//    if(numeroRomano.isNullOrEmpty()){
//        return
//    }
//
//    for (i in numeroRomano!!.indices) {
//        val atual = numerosRomanos.getValue(numeroRomano[i])
//
//        val proximo = when (i + 1) {
//            numeroRomano.length -> 0
//            else -> numerosRomanos.getValue(numeroRomano[i + 1])
//        }
//        if(proximo == 0){
//            resultado += atual
//            break
//        }
//        if(proximo == 5){
//            resultado += 4
//            break
//        }
//        resultado += atual
//    }
//    print(resultado)
//
//    print(resultado)
//}