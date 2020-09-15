package Exercicios.Exercicio03

fun main() {
    val produto1 = Produto("Roupas", 10, 4)

    produto1.darBaixa(2)
    produto1.darBaixa(4)
    println(produto1.mostra())

    produto1.mudarNome("Sapatos")
    produto1.mudarQtdMinima(2)
    produto1.repor(5)
    println(produto1.mostra())
}