package br.ufsc.das;

public class LancarExcecaoCartaoNaoReconhecido {

	public void lancarExcecao(CartaoCredito cartao) {

		throw new IllegalArgumentException("N�o foi poss�vel identificar a bandeira do cart�o com n�mero " + cartao.getNumero());

	}

}
