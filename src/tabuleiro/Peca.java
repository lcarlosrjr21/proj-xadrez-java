package tabuleiro;

public class Peca {
	protected Posicao posicao;
	private Tabuleiro tabuleiro;

	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		posicao = null; // o java informa nulo como padrao, porém está aqui para ilustrar
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
}