package Exercicios.Exercicio03

class Produto(override var nome: String, override var qtdAtual: Int, override var qtdMinima: Int): Estoque {
    init {
        if(qtdAtual < 0){
            qtdAtual = 0
        }else if(qtdMinima < 0){
            qtdMinima = 0
        }
    }
}