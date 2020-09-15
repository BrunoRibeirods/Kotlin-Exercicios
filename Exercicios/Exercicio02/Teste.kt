package Exercicios.Exercicio02

fun main() {
    val item1 = Item(6060, "Computador", 1, 1200.0)
    val item2 = Item(8080, "Iphone", 1, 2200.0)
    val item3 = Item(8081, "Samsung", 2, 500.0)

    val fatura = Fatura(item1, item2, item3)

    fatura.acessarFatura()
    println("\nTotal: ${fatura.getTotalFatura()}")
}