package Exercicios.Exercicio02

class Item(override val numItem: Int, override val descricao: String, override var quantidade: Int, override var valorUni: Double): ListaDeItens {
    init {
        if(quantidade < 0){
            quantidade = 0
        }else if(valorUni < 0){
            valorUni = 0.0
        }
    }
}