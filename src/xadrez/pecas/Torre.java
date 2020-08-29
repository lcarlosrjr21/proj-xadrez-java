package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Torre extends PecaXadrez{

	public Torre(Tabuleiro tabuleiro, Cor cor) { // construtor da super classe
		super(tabuleiro, cor);
	}
	
	@Override
	public String toString() {
		return "T"; // T de "Torre"
	}
	
}
