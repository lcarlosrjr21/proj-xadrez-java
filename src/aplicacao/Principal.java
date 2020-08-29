package aplicacao;

import xadrez.PartidaXadrez;

public class Principal {

	public static void main(String[] args) {
		
		PartidaXadrez partidaXadrez = new PartidaXadrez();
		UI.imprimeTabuleiro(partidaXadrez.getPecas());

	}

}