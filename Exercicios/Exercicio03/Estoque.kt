package Exercicios.Exercicio03

interface Estoque {
    var nome: String
    var qtdAtual: Int
    var qtdMinima: Int

    fun mudarNome(nomeNovo: String){
        nome = nomeNovo
    }

    fun mudarQtdMinima(qtdMinimaNova: Int){
        qtdMinima = qtdMinimaNova
        if (qtdMinima < 0) qtdMinima = 0
    }

    fun repor(qtd: Int){
        qtdAtual += qtd
        if (qtdAtual < 0) qtdAtual = 0
    }

    fun darBaixa(qtd: Int){
        qtdAtual -= qtd
        if (qtdAtual < 0) qtdAtual = 0
    }

    fun mostra(): String{
        return "\n-----$nome-----\nQuantidade minima: $qtdMinima\nQuantidade Atual: $qtdAtual\nRepor: ${precisaRepor()}"
    }

    fun precisaRepor(): Boolean{
        return qtdAtual <= qtdMinima
    }


}