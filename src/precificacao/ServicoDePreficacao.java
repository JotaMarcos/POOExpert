package precificacao;

public class ServicoDePreficacao {

    void definirPrecoVenda(Produto produto, double percentualMargemLucro) {
        //produto.precoVenda = produto.precoCusto * ((percentualMargemLucro / 100) + 1);

        double precoVendaCalculado = MatematicaUtil.calcularAcrescimo(produto.precoCusto, percentualMargemLucro);
        precoVendaCalculado += Produto.custoEmbalagem;

        produto.precoVenda = precoVendaCalculado;

    }
}