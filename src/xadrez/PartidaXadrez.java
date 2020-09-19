package xadrez;

import tabuleiro.Peca;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciarPartida();
	}
	
	public PecaXadrez [][] getPecas(){
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		
		for (int i=0; i<tabuleiro.getLinhas(); i++) {
			for (int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaXadrez) tabuleiro.peca(i,j);
			}
		}
		return mat;
	}
	
	public PecaXadrez moverPeca(PosicaoXadrez posicaoOrigem, PosicaoXadrez posicaoDestino) {
		Posicao origem = posicaoOrigem.paraPosicao();
		Posicao destino = posicaoDestino.paraPosicao();
		validaPosicaoOrigem(origem);
		Peca PecaCapturada = facaMovimento(origem, destino);
		return (PecaXadrez)PecaCapturada;
	}
	
	private Peca facaMovimento(Posicao origem, Posicao destino) {
		Peca p = tabuleiro.removePeca(origem);
		Peca pecaCapturada = tabuleiro.removePeca(destino);
		tabuleiro.lugarPeca(p, destino);
		return pecaCapturada;
		
	}
	
	private void validaPosicaoOrigem(Posicao posicao) {
		if(!tabuleiro.existeUmaPeca(posicao)) {
			throw new ExcecaoXadrez("Nao ha peca na posicao de origem");
		}
	}
	
	private void lugarNovaPeca(char coluna, int linha, PecaXadrez peca) {
		tabuleiro.lugarPeca(peca, new PosicaoXadrez(coluna, linha).paraPosicao());
	}
	
	private void iniciarPartida() {
		lugarNovaPeca('a', 1, new Torre(tabuleiro, Cor.BRANCO));
		
        /*lugarNovaPeca('b', 1, new Cavalo(tabuleiro, Cor.BRANCO));
        lugarNovaPeca('c', 1, new Bispo(tabuleiro, Cor.BRANCO));
        lugarNovaPeca('d', 1, new Rainha(tabuleiro, Cor.BRANCO));*/
        
        lugarNovaPeca('e', 1, new Rei(tabuleiro, Cor.BRANCO));
        /*
        lugarNovaPeca('f', 1, new Bispo(tabuleiro, Cor.BRANCO));
        lugarNovaPeca('g', 1, new Cavalo(tabuleiro, Cor.BRANCO));*/
        
        lugarNovaPeca('h', 1, new Torre(tabuleiro, Cor.BRANCO));
        
        /*lugarNovaPeca('a', 2, new Peao(tabuleiro, Cor.BRANCO, this));
        lugarNovaPeca('b', 2, new Peao(tabuleiro, Cor.BRANCO, this));
        lugarNovaPeca('c', 2, new Peao(tabuleiro, Cor.BRANCO, this));
        lugarNovaPeca('d', 2, new Peao(tabuleiro, Cor.BRANCO, this));
        lugarNovaPeca('e', 2, new Peao(tabuleiro, Cor.BRANCO, this));
        lugarNovaPeca('f', 2, new Peao(tabuleiro, Cor.BRANCO, this));
        lugarNovaPeca('g', 2, new Peao(tabuleiro, Cor.BRANCO, this));
        lugarNovaPeca('h', 2, new Peao(tabuleiro, Cor.BRANCO, this));*/

        lugarNovaPeca('a', 8, new Torre(tabuleiro, Cor.PRETO));
        
        /*lugarNovaPeca('b', 8, new Cavalo(tabuleiro, Cor.PRETO));
        lugarNovaPeca('c', 8, new Bispo(tabuleiro, Cor.PRETO));
        lugarNovaPeca('d', 8, new Rainha(tabuleiro, Cor.PRETO));
        */
        
        lugarNovaPeca('e', 8, new Rei(tabuleiro, Cor.PRETO));
        
        /*
        lugarNovaPeca('f', 8, new Bispo(tabuleiro, Cor.PRETO));
        lugarNovaPeca('g', 8, new Cavalo(tabuleiro, Cor.PRETO));*/
        
        lugarNovaPeca('h', 8, new Torre(tabuleiro, Cor.PRETO));
        
       /* lugarNovaPeca('a', 7, new Peao(tabuleiro, Cor.PRETO, this));
        lugarNovaPeca('b', 7, new Peao(tabuleiro, Cor.PRETO, this));
        lugarNovaPeca('c', 7, new Peao(tabuleiro, Cor.PRETO, this));
        lugarNovaPeca('d', 7, new Peao(tabuleiro, Cor.PRETO, this));
        lugarNovaPeca('e', 7, new Peao(tabuleiro, Cor.PRETO, this));
        lugarNovaPeca('f', 7, new Peao(tabuleiro, Cor.PRETO, this));
        lugarNovaPeca('g', 7, new Peao(tabuleiro, Cor.PRETO, this));*/
		
	}
}
