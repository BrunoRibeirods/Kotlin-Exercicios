package Exercicios.Exercicio02

class Fatura(vararg item: Item) {
    var listaI = mutableListOf<Item>()
    var total = 0.0

    init {
        listaI.addAll(item)
    }

    fun getTotalFatura(): Double{
        for(compra in listaI) total += compra.valorUni * compra.quantidade
        return total
    }

    fun acessarFatura(){
        for (compra in listaI){
            println("(#${compra.numItem}) ${compra.quantidade}x ${compra.descricao}, Total -> ${compra.valorUni * compra.quantidade}")
        }
    }
}